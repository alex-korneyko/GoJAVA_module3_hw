package GoJAVA.Module3.Files;

public class Directory {

    /** Array containing all files in current directory */
    private File[] files;

    public Directory() {

        //for example
        files = new File[]{new TextFile(), new AudioFile(), new ImageFile()};
    }

    /**
     * Show info about all files in directory
     * First common info, then own info
     */
    public void GetDirInfo() {

        for(File file: files){
            System.out.println(file.GetFileInfo());
        }
    }
}
