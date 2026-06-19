CREATE TABLE IF NOT EXISTS merchants (
  merchant_id VARCHAR(64) PRIMARY KEY,
  name VARCHAR(120) NOT NULL,
  active BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS payment_methods (
  token VARCHAR(128) PRIMARY KEY,
  brand VARCHAR(32) NOT NULL,
  last_four VARCHAR(4) NOT NULL,
  enabled BOOLEAN NOT NULL
);

CREATE TABLE IF NOT EXISTS payments (
  payment_id UUID PRIMARY KEY,
  merchant_id VARCHAR(64) NOT NULL,
  method_token VARCHAR(128) NOT NULL,
  amount NUMERIC(19,2) NOT NULL,
  currency VARCHAR(3) NOT NULL,
  status VARCHAR(32) NOT NULL,
  authorization_code VARCHAR(32),
  idempotency_key VARCHAR(128) NOT NULL UNIQUE,
  created_at TIMESTAMP WITH TIME ZONE NOT NULL,
  updated_at TIMESTAMP WITH TIME ZONE NOT NULL
);
