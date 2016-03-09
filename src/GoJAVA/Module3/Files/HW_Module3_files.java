package GoJAVA.Module3.Files;

/**
 * Empty class
 * Only for file name
 */
public final class HW_Module3_files {}

/**
 * Class {@code Directory} include three files
 * @author Alex Korneyko
 */
class Directory
{
    private File[] files;

    /**
     * Constructor
     */
    Directory()
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

//-----------------------------------------------------------------
/**
 * Class {@code File} is common for all files
 * @author Alex Korneyko
 */
class File
{
    /**
     * Common method for all files
     */
    public void GetFileInfo()
    {
        System.out.print("I am");
    }
}

//-----------------------------------------------------------------
/**
 * Class {@code TextFile} inherited from class {@code File}
 * @author Alex Korneyko
 */
class TextFile extends File
{
    /**
     * Method for only text files
     */
    public void TxtFileGetInfo()
    {
        System.out.println(" a text file");
    }
}

//-----------------------------------------------------------------
/**
 * Class {@code AudioFile} inherited from class {@code File}
 * @author Alex Korneyko
 */
class AudioFile extends File
{
    /**
     * Method for only audio files
     */
    public void AudFileGetInfo()
    {
        System.out.println(" an audio file");
    }
}

//-----------------------------------------------------------------
/**
 * Class {@code ImageFile} inherited from class {@code File}
 * @author Alex Korneyko
 */
class ImageFile extends File
{
    /**
     * Method for only image files
     */
    public void ImgFileGetInfo()
    {
        System.out.println(" an image file");
    }
}
