
public class SearchAlgorithms {

    // Linear search method
    public static Product linearSearch(Product[] products, String searchId) {
        for (Product product : products) {
            if (product.getProductId().equals(searchId)) {
                return product;
            }
        }
        return null; // Not found
    }
    // Binary search method
    public static Product binarySearch(Product[] products, String searchId) {
        int left = 0;
        int right = products.length - 1;


        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(searchId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Not found
    
}


}
