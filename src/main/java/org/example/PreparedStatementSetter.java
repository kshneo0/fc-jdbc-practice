package org.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * author :  sanghoonkim
 * date : 2022/12/29
 */
public interface PreparedStatementSetter {
    void setter(PreparedStatement pstmt) throws SQLException;
}
