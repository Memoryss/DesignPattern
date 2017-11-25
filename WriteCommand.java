class RAMWriteCommand implements Command {

    private RAMComponent receive = null;
    
    void SetRAMComponent(RAMComponent rev) {
        this.receive = rev;
    }

    public void execute() {
        receive.Write();
    }
}

class DiskWriteCommand implements Command {

    private DiskComponent receive = null;
    
    void SetDiskComponent(DiskComponent rev) {
        this.receive = rev;
    }

    public void execute() {
        receive.Write();
    }
}