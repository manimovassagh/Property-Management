-- Create Users Table
CREATE TABLE users (
                       id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                       full_name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) UNIQUE NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       phone_number VARCHAR(50),
                       user_type VARCHAR(50) CHECK (user_type IN ('buyer', 'seller', 'agent')),
                       created_at TIMESTAMP DEFAULT now()
);

-- Create Addresses Table
CREATE TABLE addresses (
                           id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                           street VARCHAR(255) NOT NULL,
                           city VARCHAR(255) NOT NULL,
                           state VARCHAR(255) NOT NULL,
                           country VARCHAR(255) NOT NULL,
                           postal_code VARCHAR(20)
);

-- Create Properties Table
CREATE TABLE properties (
                            id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                            title VARCHAR(255) NOT NULL,
                            description TEXT,
                            price DECIMAL(10,2) NOT NULL,
                            property_type VARCHAR(50) CHECK (property_type IN ('apartment', 'house', 'land', 'commercial')),
                            status VARCHAR(50) CHECK (status IN ('available', 'sold', 'rented')),
                            owner_id UUID REFERENCES users(id) ON DELETE CASCADE,
                            address_id UUID REFERENCES addresses(id) ON DELETE SET NULL,
                            created_at TIMESTAMP DEFAULT now()
);

-- Create Images Table
CREATE TABLE images (
                        id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                        property_id UUID REFERENCES properties(id) ON DELETE CASCADE,
                        image_url TEXT NOT NULL,
                        uploaded_at TIMESTAMP DEFAULT now()
);

-- Create Favorites Table
CREATE TABLE favorites (
                           id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                           user_id UUID REFERENCES users(id) ON DELETE CASCADE,
                           property_id UUID REFERENCES properties(id) ON DELETE CASCADE,
                           added_at TIMESTAMP DEFAULT now(),
                           UNIQUE(user_id, property_id)
);

-- Create Messages Table
CREATE TABLE messages (
                          id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                          sender_id UUID REFERENCES users(id) ON DELETE CASCADE,
                          receiver_id UUID REFERENCES users(id) ON DELETE CASCADE,
                          property_id UUID REFERENCES properties(id) ON DELETE CASCADE,
                          message TEXT NOT NULL,
                          sent_at TIMESTAMP DEFAULT now()
);

-- Create Contracts Table
CREATE TABLE contracts (
                           id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                           buyer_id UUID REFERENCES users(id) ON DELETE CASCADE,
                           seller_id UUID REFERENCES users(id) ON DELETE CASCADE,
                           property_id UUID REFERENCES properties(id) ON DELETE CASCADE,
                           contract_date TIMESTAMP DEFAULT now(),
                           status VARCHAR(50) CHECK (status IN ('pending', 'signed', 'rejected'))
);

-- Create Reviews Table
CREATE TABLE reviews (
                         id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
                         reviewer_id UUID REFERENCES users(id) ON DELETE CASCADE,
                         property_id UUID REFERENCES properties(id) ON DELETE CASCADE,
                         rating INT CHECK (rating BETWEEN 1 AND 5),
                         comment TEXT,
                         created_at TIMESTAMP DEFAULT now()
);
