import java.util.*;

public class ItemTool{
    public static List<InventoryItem> getAllInventoryItemsLighterThan(List<InventoryItem> items, double weight){
        List<InventoryItem> result = new ArrayList<>();
        for (int i = 0; i < items.size(); i ++){
            double itemWeight = items.get(i).getWeight();
            if (itemWeight < weight){
                result.add(items.get(i));
            }
        }
        return result;
    }

    public static List<Magazine> getAllMagazines(InventoryItem[] items){
        List<Magazine> result = new ArrayList<>();
        for (int i = 0; i < items.length; i ++){
            if (items[i] instanceof Magazine){
                result.add((Magazine)items[i]);
            }
        }
        return result;
    }

    public static List<InventoryItem> getAllNonBooksOfCategory(InventoryItem[] items, char category){
        List<InventoryItem> result = new ArrayList<>();
        for (int i = 0; i < items.length; i ++){
            if (items[i].getCategory() == category){
                result.add(items[i]);
            }
        }
        return result;
    }

    public static Laptop[] getAllLaptopsWithNumCpuGreaterThan(Map<String, InventoryItem> map, int numCpu){
        Laptop[] result = new Laptop[10];
        int index = 0;
        for (String temp:map.keySet()){
            InventoryItem items = map.get(temp);
            if (items instanceof Laptop){
                Laptop laptop = (Laptop)items;
                if (laptop.getNumCpu() > numCpu){
                   result[index] = laptop;
                   index++;
                }
            }
        }

        return result;
    }
}