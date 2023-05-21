CREATE SCHEMA IF NOT EXISTS outbox;
CREATE SEQUENCE IF NOT EXISTS outbox.shipment_outbox_id_seq;

DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_type WHERE typname = 'shipment_outbox_state') THEN
        CREATE TYPE outbox.shipment_outbox_state AS enum
        (
            'SUCCESS','FAIL','PENDING'
        );
    END IF;
END$$;

CREATE TABLE IF NOT EXISTS outbox.shipment_outbox (
    id integer default nextval('outbox.shipment_outbox_id_seq'::regclass) not null
                                                  constraint shipment_outbox_pkey
                                                  primary key,
                                                  topic_name text not null,
                                                  payload jsonb not null,
                                                  state outbox.shipment_outbox_state not null
);
