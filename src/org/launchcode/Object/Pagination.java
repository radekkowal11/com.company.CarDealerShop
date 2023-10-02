package src.org.launchcode.Object;

import java.util.List;

public class Pagination {
    private List<Car> data;
    private int pageSize = 3;

    private int currentPage = 1;

    public Pagination(List<Car> data) {
        this.data = data;
    }

    public List<Car> getCurrentPageData() {
        int startIndex = (currentPage - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, data.size());
        return data.subList(startIndex, endIndex);
    }

    public void nextPage() {
        if (currentPage < getTotalPages()) {
            currentPage++;
        }
    }

    public void previousPage() {
        if (currentPage > 1) {
            currentPage--;
        }
    }

    public int getTotalPages() {
        return (int) Math.ceil((double) data.size() / pageSize);
    }

    public int getCurrentPage() {
        return currentPage;
    }
}
