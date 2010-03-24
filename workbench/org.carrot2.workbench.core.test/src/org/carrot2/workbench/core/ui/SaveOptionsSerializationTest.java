package org.carrot2.workbench.core.ui;

import java.io.StringReader;
import java.io.StringWriter;

import junit.framework.TestCase;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.carrot2.workbench.core.ui.SearchEditor.SaveOptions;
import org.carrot2.workbench.core.ui.SearchEditor.SaveOptions.SaveFormat;
import junit.framework.Assert;
import org.simpleframework.xml.core.Persister;

public class SaveOptionsSerializationTest extends TestCase
{
    public void testSerializeAndBack() throws Exception
    {
        SaveOptions opts = new SaveOptions();
        saveLoad(opts);
        opts.directory = "abc";
        saveLoad(opts);
        opts.format = SaveFormat.RSS20;
        saveLoad(opts);
    }

    public void testEmptyDefaults() throws Exception
    {
        SaveOptions o1 = new SaveOptions();
        final Persister persister = new Persister();
        SaveOptions o2 = persister.read(SaveOptions.class, new StringReader("<save-dialog-options />"));
        Assert.assertTrue(EqualsBuilder.reflectionEquals(o1, o2));
    }

    private void saveLoad(SaveOptions object) throws Exception
    {
        final StringWriter sw = new StringWriter();
        final Persister persister = new Persister();
        persister.write(object, sw);
        SaveOptions clone = persister.read(SaveOptions.class, new StringReader(sw.toString()));
        Assert.assertTrue(EqualsBuilder.reflectionEquals(clone, object));
    }
}
