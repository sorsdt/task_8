package epam.webapp.model;

public class MyBean {
    private String rows;
    private String cols;
    private String[][] table;

    public String[][] getTable() {
        if (table == null) table = generateTable();
        return table;
    }

    private String[][] generateTable() {
        String[][] table = new String[0][];
        try {
            table = new String[Integer.valueOf(rows)][Integer.valueOf(cols)];
            fillArray(table);
        } catch (Exception ignored) {
        }
        return table;
    }

    private void fillArray(String[][] table) {
        int counter = 0;
        for (int rows = 0; rows < table.length; rows++) {
            for (int cols = 0; cols < table[rows].length; cols++) {
                table[rows][cols] = String.valueOf(++counter);
            }
        }
    }

    public String getRows() {
        return this.rows;
    }

    public String getCols() {
        return this.cols;
    }

    public void setRows(String rows) {
        this.rows = rows;
    }

    public void setCols(String cols) {
        this.cols = cols;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }
}