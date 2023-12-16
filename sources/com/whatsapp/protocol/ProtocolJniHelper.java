package com.whatsapp.protocol;

import X.AnonymousClass001;
import X.AnonymousClass24P;
import X.AnonymousClass32W;
import X.AnonymousClass36K;
import X.AnonymousClass39V;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

public class ProtocolJniHelper {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r8[0] instanceof X.AnonymousClass39V) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createProtocolTreeNode(java.lang.String r7, java.lang.Object[] r8, java.lang.Object[] r9, byte[] r10) {
        /*
            r6 = this;
            r2 = 1
            r5 = 0
            if (r8 == 0) goto L_0x000b
            r0 = r8[r5]
            boolean r0 = r0 instanceof X.AnonymousClass39V
            r1 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            if (r9 == 0) goto L_0x0015
            r0 = r9[r5]
            boolean r0 = r0 instanceof X.AnonymousClass36K
            if (r0 != 0) goto L_0x0015
            r2 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            r4 = 0
            if (r8 == 0) goto L_0x0029
            int r3 = r8.length
            X.39V[] r2 = new X.AnonymousClass39V[r3]
            r1 = 0
        L_0x0020:
            if (r1 >= r3) goto L_0x002a
            r0 = r8[r1]
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0020
        L_0x0029:
            r2 = r4
        L_0x002a:
            if (r9 == 0) goto L_0x0038
            int r1 = r9.length
            X.36K[] r4 = new X.AnonymousClass36K[r1]
        L_0x002f:
            if (r5 >= r1) goto L_0x0038
            r0 = r9[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L_0x002f
        L_0x0038:
            X.36K r0 = new X.36K
            r0.<init>(r7, r10, r2, r4)
            return r0
        L_0x003e:
            java.lang.String r0 = "ProtocolJniHelper/createProtocolTreeNode"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.ProtocolJniHelper.createProtocolTreeNode(java.lang.String, java.lang.Object[], java.lang.Object[], byte[]):java.lang.Object");
    }

    public Object createKeyValue(String str, String str2, Object obj, byte b) {
        if (obj == null) {
            return new AnonymousClass39V((Jid) null, str, str2, b);
        }
        Jid jid = (Jid) obj;
        return new AnonymousClass39V(jid, str, jid.getRawString(), b);
    }

    public Object[] getAttributesFromProtocolTreeNode(Object obj) {
        if (obj instanceof AnonymousClass36K) {
            return ((AnonymousClass36K) obj).A0u();
        }
        throw AnonymousClass001.A0c("ProtocolJniHelper/getAttributesFromProtocolTreeNode");
    }

    public Object[] getChildrenFromProtocolTreeNode(Object obj) {
        if ((obj instanceof AnonymousClass36K) && obj != null) {
            return ((AnonymousClass36K) obj).A03;
        }
        throw AnonymousClass001.A0c("ProtocolJniHelper/getChildrenFromProtocolTreeNode");
    }

    public byte[] getDataFromProtocolTreeNode(Object obj) {
        if (obj instanceof AnonymousClass36K) {
            return ((AnonymousClass36K) obj).A01;
        }
        throw AnonymousClass001.A0c("ProtocolJniHelper/getDataFromProtocolTreeNode");
    }

    public String getKeyFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass39V) {
            return ((AnonymousClass39V) obj).A02;
        }
        throw AnonymousClass001.A0c("ProtocolJniHelper/getKeyFromKeyValue");
    }

    public String getTagFromProtocolTreeNode(Object obj) {
        if (obj instanceof AnonymousClass36K) {
            return ((AnonymousClass36K) obj).A00;
        }
        throw AnonymousClass001.A0c("ProtocolJniHelper/getTagFromProtocolTreeNode");
    }

    public byte getTypeFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass39V) {
            return ((AnonymousClass39V) obj).A00;
        }
        throw AnonymousClass001.A0c("ProtocolJniHelper/getTypeFromKeyValue");
    }

    public String getValueStringFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass39V) {
            return ((AnonymousClass39V) obj).A03;
        }
        throw AnonymousClass001.A0c("ProtocolJniHelper/getValueStringFromKeyValue");
    }

    public Object createNewJid(String str) {
        try {
            return AnonymousClass32W.A01(str);
        } catch (AnonymousClass24P e) {
            Log.w("ProtocolJniHelper/createNewJid", e);
            return null;
        }
    }
}
