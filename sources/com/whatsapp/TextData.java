package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import java.io.Serializable;
import java.util.Arrays;

public class TextData implements Serializable {
    public static final long serialVersionUID = 1;
    public int backgroundColor;
    public int fontStyle;
    public int textColor;
    public byte[] thumbnail;

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.fontStyle);
        AnonymousClass000.A1M(objArr, this.textColor);
        AnonymousClass000.A1N(objArr, this.backgroundColor);
        objArr[3] = this.thumbnail;
        return Arrays.deepHashCode(objArr);
    }

    public boolean equals(Object obj) {
        int length;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextData textData = (TextData) obj;
        if (this.fontStyle != textData.fontStyle || this.textColor != textData.textColor || this.backgroundColor != textData.backgroundColor) {
            return false;
        }
        byte[] bArr = this.thumbnail;
        byte[] bArr2 = textData.thumbnail;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null) {
            length = bArr2.length;
        } else if (bArr2 != null) {
            return Arrays.equals(bArr, bArr2);
        } else {
            length = bArr.length;
        }
        if (length != 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        Object valueOf;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("TextData; fontStyle=");
        A0o.append(this.fontStyle);
        A0o.append("; textColor=");
        A0o.append(this.textColor);
        A0o.append("; backgroundColor=");
        A0o.append(this.backgroundColor);
        A0o.append("; thumbnail=");
        byte[] bArr = this.thumbnail;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        return AnonymousClass000.A0R(valueOf, A0o);
    }
}
