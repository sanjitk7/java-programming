// similar to normal packages but is references with dot operators.
package outer_pack.inner_pack;
public class sub_package {
    public static void main(String[] args) {
        System.out.println("sub-packages!");
    }
}

// javac -d . sub_package.java
 
// java outer_pack/inner_pack/sub_package
//  OR!
// java outer_pack.inner_pack.sub_package