class RAMComponent implements Component{
    public void Read() {
        System.out.println("RAM Read");
    }

    public void Write() {
        System.out.println("RAM Write");
    }
}

class DiskComponent implements Component{
    public void Read() {
        System.out.println("Disk Read");
    }

    public void Write() {
        System.out.println("Disk Write");
    }
}