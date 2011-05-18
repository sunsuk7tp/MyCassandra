DELIMITER //
CREATE PROCEDURE get_row(IN id VARCHAR(16))
BEGIN
    SELECT ColumnFamily FROM _data WHERE Row_Key = id;
END//
CREATE PROCEDURE set_row(IN cf VARBINARY(2048),IN id VARCHAR(16))
BEGIN
    UPDATE _data SET ColumnFamily = cf WHERE Row_Key = id;
END//

