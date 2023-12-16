package com.whatsapp.protocol;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass36K;
import X.AnonymousClass39V;
import com.whatsapp.jid.Jid;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class VoipStanzaChildNode {
    public final AnonymousClass39V[] attributes;
    public final VoipStanzaChildNode[] children;
    public final byte[] data;
    public final String tag;

    public class Builder {
        public Map attributes;
        public List children;
        public byte[] data;
        public final String tag;

        private Builder addAttribute(String str, AnonymousClass39V r3) {
            Map map = this.attributes;
            if (map == null) {
                map = AnonymousClass001.A0t();
                this.attributes = map;
            }
            if (map.put(str, r3) == null) {
                return this;
            }
            throw AnonymousClass001.A0c("node may not have duplicate attributes");
        }

        public Builder addAttributes(AnonymousClass39V[] r5) {
            if (r5 != null) {
                for (AnonymousClass39V r0 : r5) {
                    addAttribute(r0.A02, r0.A03);
                }
            }
            return this;
        }

        public Builder addChild(VoipStanzaChildNode voipStanzaChildNode) {
            if (this.data == null) {
                List list = this.children;
                if (list == null) {
                    list = AnonymousClass001.A0s();
                    this.children = list;
                }
                list.add(voipStanzaChildNode);
                return this;
            }
            throw AnonymousClass001.A0c("node may not have both data and children");
        }

        public Builder addChildren(VoipStanzaChildNode[] voipStanzaChildNodeArr) {
            if (voipStanzaChildNodeArr != null) {
                for (VoipStanzaChildNode addChild : voipStanzaChildNodeArr) {
                    addChild(addChild);
                }
            }
            return this;
        }

        public VoipStanzaChildNode build() {
            AnonymousClass39V[] r5;
            int size;
            Map map = this.attributes;
            VoipStanzaChildNode[] voipStanzaChildNodeArr = null;
            if (map == null || (size = map.size()) <= 0) {
                r5 = null;
            } else {
                AnonymousClass39V[] r52 = new AnonymousClass39V[size];
                Iterator A0q = AnonymousClass000.A0q(this.attributes);
                int i = 0;
                while (A0q.hasNext()) {
                    r52[i] = AnonymousClass001.A0w(A0q).getValue();
                    i++;
                }
                r5 = r52;
            }
            List list = this.children;
            if (list != null) {
                voipStanzaChildNodeArr = (VoipStanzaChildNode[]) list.toArray(new VoipStanzaChildNode[0]);
            }
            return new VoipStanzaChildNode(this.tag, r5, voipStanzaChildNodeArr, this.data);
        }

        public Builder setData(byte[] bArr) {
            if (this.children == null) {
                this.data = bArr;
                return this;
            }
            throw AnonymousClass001.A0c("node may not have both data and children");
        }

        public Builder(String str) {
            this.tag = str;
        }

        public Builder addAttribute(String str, Jid jid) {
            addAttribute(str, new AnonymousClass39V(jid, str));
            return this;
        }

        public Builder addAttribute(String str, String str2) {
            addAttribute(str, new AnonymousClass39V(str, str2));
            return this;
        }
    }

    public static VoipStanzaChildNode fromProtocolTreeNode(AnonymousClass36K r7) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr;
        AnonymousClass36K[] r6 = r7.A03;
        if (r6 != null) {
            int length = r6.length;
            voipStanzaChildNodeArr = new VoipStanzaChildNode[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                voipStanzaChildNodeArr[i2] = fromProtocolTreeNode(r6[i]);
                i++;
                i2++;
            }
        } else {
            voipStanzaChildNodeArr = null;
        }
        return new VoipStanzaChildNode(r7.A00, r7.A0u(), voipStanzaChildNodeArr, r7.A01);
    }

    public AnonymousClass39V[] getAttributesCopy() {
        AnonymousClass39V[] r1 = this.attributes;
        if (r1 != null) {
            return (AnonymousClass39V[]) Arrays.copyOf(r1, r1.length);
        }
        return null;
    }

    public Object[] getAttributesFlattedCopy() {
        AnonymousClass39V[] r7 = this.attributes;
        if (r7 == null) {
            return null;
        }
        Object[] objArr = new Object[(r6 * 2)];
        int i = 0;
        for (AnonymousClass39V r2 : r7) {
            int i2 = i + 1;
            objArr[i] = r2.A02;
            Object obj = r2.A01;
            i = i2 + 1;
            if (obj == null) {
                obj = r2.A03;
            }
            objArr[i2] = obj;
        }
        return objArr;
    }

    public VoipStanzaChildNode[] getChildrenCopy() {
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr != null) {
            return (VoipStanzaChildNode[]) Arrays.copyOf(voipStanzaChildNodeArr, voipStanzaChildNodeArr.length);
        }
        return null;
    }

    public byte[] getDataCopy() {
        byte[] bArr = this.data;
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }

    public AnonymousClass39V getFirstAttributeByName(String str) {
        AnonymousClass39V[] r4 = this.attributes;
        if (r4 == null) {
            return null;
        }
        for (AnonymousClass39V r1 : r4) {
            if (r1.A02.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public VoipStanzaChildNode getFirstChildByTag(String str) {
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr == null) {
            return null;
        }
        for (VoipStanzaChildNode voipStanzaChildNode : voipStanzaChildNodeArr) {
            if (voipStanzaChildNode.tag.equals(str)) {
                return voipStanzaChildNode;
            }
        }
        return null;
    }

    public boolean hasAttribute(AnonymousClass39V r6) {
        AnonymousClass39V[] r4 = this.attributes;
        if (r4 != null) {
            for (AnonymousClass39V equals : r4) {
                if (equals.equals(r6)) {
                    return true;
                }
            }
        }
        return false;
    }

    public AnonymousClass36K toProtocolTreeNode() {
        AnonymousClass36K[] r4;
        int length;
        byte[] bArr = this.data;
        if (bArr != null) {
            return new AnonymousClass36K(this.tag, bArr, this.attributes);
        }
        VoipStanzaChildNode[] voipStanzaChildNodeArr = this.children;
        if (voipStanzaChildNodeArr == null || (length = voipStanzaChildNodeArr.length) <= 0) {
            r4 = null;
        } else {
            r4 = new AnonymousClass36K[length];
            int i = 0;
            int i2 = 0;
            do {
                r4[i2] = voipStanzaChildNodeArr[i].toProtocolTreeNode();
                i++;
                i2++;
            } while (i < length);
        }
        return AnonymousClass36K.A0J(this.tag, this.attributes, r4);
    }

    public String getTag() {
        return this.tag;
    }

    public VoipStanzaChildNode(String str, AnonymousClass39V[] r2, VoipStanzaChildNode[] voipStanzaChildNodeArr, byte[] bArr) {
        this.tag = str;
        this.attributes = r2;
        this.children = voipStanzaChildNodeArr;
        this.data = bArr;
    }
}
