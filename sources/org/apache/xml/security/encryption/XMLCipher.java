package org.apache.xml.security.encryption;

import X.AnonymousClass6C7;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.xml.security.transforms.Transforms;

public class XMLCipher {
    public static Class a;
    public static Log b;

    /* renamed from: org.apache.xml.security.encryption.XMLCipher$1  reason: invalid class name */
    public class AnonymousClass1 {
    }

    public class Factory {

        public class AgreementMethodImpl implements AgreementMethod {
        }

        public class CipherDataImpl implements CipherData {
        }

        public class CipherReferenceImpl implements CipherReference {
        }

        public class CipherValueImpl implements CipherValue {
        }

        public class EncryptedDataImpl extends EncryptedTypeImpl implements EncryptedData {
        }

        public class EncryptedKeyImpl extends EncryptedTypeImpl implements EncryptedKey {
        }

        public abstract class EncryptedTypeImpl {
        }

        public class EncryptionMethodImpl implements EncryptionMethod {
        }

        public class EncryptionPropertiesImpl implements EncryptionProperties {
        }

        public class EncryptionPropertyImpl implements EncryptionProperty {
        }

        public class ReferenceListImpl implements ReferenceList {

            public class DataReference extends ReferenceImpl {
            }

            public class KeyReference extends ReferenceImpl {
            }

            public abstract class ReferenceImpl implements Reference {
            }
        }

        public class TransformsImpl extends Transforms implements Transforms {
            public String d() {
                return "http://www.w3.org/2001/04/xmlenc#";
            }
        }
    }

    public class Serializer {
    }

    static {
        Class a2 = a("org.apache.xml.security.encryption.XMLCipher");
        a = a2;
        b = LogFactory.getLog(a2.getName());
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw AnonymousClass6C7.A0r(e);
        }
    }
}
