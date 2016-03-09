package GoJAVA.Module3.Files;

public class Directory
{
    private File[] files;

    /**
     * Constructor
     */
    public Directory()
    {
        files = new File[]{new TextFile(), new AudioFile(), new ImageFile()};
    }

    /**
     * Show info about all files in directory
     * First common info, then own info
     */
    public void GetDirInfo()
    {
        files[0].GetFileInfo();
        ((TextFile)files[0]).TxtFileGetInfo();

        files[1].GetFileInfo();
        ((AudioFile)files[1]).AudFileGetInfo();

        files[2].GetFileInfo();
        ((ImageFile)files[2]).ImgFileGetInfo();
    }
}
