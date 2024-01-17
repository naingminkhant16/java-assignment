/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author naingminkhant
 */
public class Column {

    private String name;
    private String type;
    private boolean isNull;
    private boolean isPrimarykey;

    public Column(String name, String type, boolean isNull, boolean isPrimarykey) {
        this.name = name;
        this.type = type;
        this.isNull = isNull;
        this.isPrimarykey = isPrimarykey;
    }

    public String getQuery() {
        String sql = name + " " + type;

        if (isPrimarykey) {
            sql += " PRIMARY KEY";
        }

        if (isNull) {
            sql += " NULL";
        } else {
            sql += " NOT NULL";
        }

        return sql;
    }

}
