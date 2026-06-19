INSERT INTO merchants (merchant_id, name, active) VALUES
  ('mrc_demo_001', 'Demo Store Peru', true),
  ('mrc_inactive_001', 'Inactive Merchant', false)
ON CONFLICT (merchant_id) DO NOTHING;

INSERT INTO payment_methods (token, brand, last_four, enabled) VALUES
  ('tok_visa_4242', 'VISA', '4242', true),
  ('tok_mc_5555', 'MASTERCARD', '5555', true),
  ('tok_disabled_0000', 'VISA', '0000', false)
ON CONFLICT (token) DO NOTHING;
