package inheritanceConcept;

public class ItemMain {

    public static void main(String[] args) {

          Item item= new Item();
        DocumentItem documentItem = new DocumentItem();

        item.setName("Piotr");
        System.out.println(item.getName());


        System.out.println(documentItem.getName());

    }
}
