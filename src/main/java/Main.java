public class Main {
    public static void main(String[] args) {

        Institution ips = new Institution("IPS");
        Lab labRedes = new Lab("LabRedes");
        Lab labProg1 = new Lab("LabProgramacao1");
        Lab labProg2 = new Lab("LabProgramacao2");

        ips.addLab(labRedes);
        ips.addLab(labProg1);
        ips.addLab(labProg2);


        Computer pc1 = new Computer("PC1", "Dell");
        Computer pc2 = new Computer("PC2", "HP");

        labProg1.addComputer(pc1);
        labProg1.addComputer(pc2);


        Component c1 = new Component("C1", "Motherboard");
        Component c5 = new Component("C5", "SSD");
        Component c6 = new Component("C6", "PowerSupply");

        Component c2 = new Component("C2", "CPU");
        Component c3 = new Component("C3", "RAM");
        Component c4 = new Component("C4", "Cache");


        c2.addPart(c4);
        c1.addPart(c2);
        c1.addPart(c3);

        pc1.addComponent(c1);
        pc1.addComponent(c5);
        pc1.addComponent(c6);


        System.out.println("Descendentes da Motherboard (C1): " + c1.countDescendants());
        System.out.println("Total de componentes no PC1: " + pc1.countAllComponents());
    }
}