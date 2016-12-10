package nyc.c4q.josegonzalez.practicaltest.Model;

import java.util.List;

/**
 * Created by mathcore on 12/10/16.
 */

public class Data {
    private long count;
    private String anchorStr;
    private List<Record> records = null;
    private Object previousPage;
    private String backAnchor;
    private long anchor;
    private long nextPage;
    private static long size;

    public long getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAnchorStr() {
        return anchorStr;
    }

    public void setAnchorStr(String anchorStr) {
        this.anchorStr = anchorStr;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    public Object getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(Object previousPage) {
        this.previousPage = previousPage;
    }

    public String getBackAnchor() {
        return backAnchor;
    }

    public void setBackAnchor(String backAnchor) {
        this.backAnchor = backAnchor;
    }

    public long getAnchor() {
        return anchor;
    }

    public void setAnchor(int anchor) {
        this.anchor = anchor;
    }

    public long getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public static long getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
