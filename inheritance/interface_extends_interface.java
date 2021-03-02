interface rock // interface1
{
    void broken();
}

interface Statue extends rock // interface inheritance
{
    void carved();
}

class interface_extends_interface implements Statue // class implements interface
{
    public void broken() {
        System.out.println("Rocks broken from the mountains");
    }

    public void carved() {
        System.out.println("broken rocks carved as statue");
    }

    public static void main(String args[]) {
        interface_extends_interface m = new interface_extends_interface();
        m.broken();
        m.carved();
    }
}
