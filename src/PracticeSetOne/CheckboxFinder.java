import java.util.ArrayList;
import java.util.List;

public class CheckboxFinder {

    // Method to find indexes of the checkboxes that are checked (true)
    public static List<Integer> findCheckedItems(List<Boolean> checkboxes) {
        List<Integer> checkedIndexes = new ArrayList<>();

        // Loop through the list of checkboxes and find the checked ones
        for (int i = 0; i < checkboxes.size(); i++) {
            if (checkboxes.get(i)) {  // If the checkbox is checked (true)
                checkedIndexes.add(i); // Add the index to the result list
            }
        }

        return checkedIndexes;
    }

    public static void main(String[] args) {
        // Simulating the state of checkboxes: true = checked, false = unchecked
        List<Boolean> checkboxes = new ArrayList<>();
        checkboxes.add(true);   // Checkbox 0 is checked
        checkboxes.add(false);  // Checkbox 1 is unchecked
        checkboxes.add(true);   // Checkbox 2 is checked
        checkboxes.add(false);  // Checkbox 3 is unchecked
        checkboxes.add(true);   // Checkbox 4 is checked

        // Call the method to find checked checkboxes
        List<Integer> checkedIndexes = findCheckedItems(checkboxes);

        // Print out the result
        System.out.println("Checked checkboxes are at indexes: " + checkedIndexes);
    }
}
