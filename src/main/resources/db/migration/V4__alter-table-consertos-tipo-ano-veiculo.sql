-- precisei criar porque tinha criado o ano do veículo como int inicialmente
-- depois só que vi que precisaria validar com Pattern, ops :)
alter table consertos alter column ano type varchar(4);