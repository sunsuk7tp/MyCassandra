DELIMITER //
CREATE PROCEDURE get_row(IN id VARCHAR(16))
BEGIN
    SELECT cf FROM _data WHERE rkey = id;
END//
CREATE PROCEDURE set_row(IN cfval VARBINARY(2048),IN id VARCHAR(16))
BEGIN
    UPDATE _data SET cf = cfval WHERE rkey = id;
END//

