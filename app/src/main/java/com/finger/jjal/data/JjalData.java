package com.finger.jjal.data;

/**
 * Created by songseunghyeon on 15. 1. 28..
 * <p/>
 * demo
 */
public class JjalData
{
    private String title;
    private String description;
    private String imagePath;

    // defalt
    public JjalData(String title, String description, String imagePath)
    {
        this.title = title;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
    }
}
