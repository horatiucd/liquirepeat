DROP VIEW IF EXISTS liquirepeat."Minifig Report" CASCADE;
CREATE OR REPLACE VIEW liquirepeat."Minifig Report"
    AS
SELECT m.id AS "Minifig ID",
       m.name AS "Minifig Name",
       m.description AS "Minifig Description"
FROM liquirepeat.minifig m;
