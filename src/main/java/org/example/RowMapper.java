package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * author :  sanghoonkim
 * date : 2022/12/29
 */
public interface RowMapper {
    Object map(ResultSet resultSet) throws SQLException;
}
