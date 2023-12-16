package org.apache.xml.security.transforms.params;

import org.apache.xml.security.transforms.TransformParam;
import org.apache.xml.security.utils.ElementProxy;

public class XPathFilterCHGPContainer extends ElementProxy implements TransformParam {
    public final String d() {
        return "http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter";
    }

    public final String e() {
        return "XPathAlternative";
    }
}
