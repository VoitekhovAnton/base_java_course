public class MainTestArrayStorage {

    static int rndNumber() {
        int number = (int) (Math.random() * 6);
        return number;
    } // Рандомный индекс для массивов

    public static ArrayStorage CreateStorage(int l, ArrayStorage storage) {
        if (l > 10000) {
            return null;
        } else {
            for (int i = 0; i < l; i++) {
                storage.save(new Resume());
            }
        }
        return storage;
    }
}
