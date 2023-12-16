package com.google.android.gms.common.data;

import X.AnonymousClass001;
import X.C148787Js;
import X.C162417s1;
import X.C163487tt;
import X.C1695389r;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;

@KeepName
public final class DataHolder extends C1695389r implements Closeable {
    public static final C148787Js A09 = new C148787Js(new String[0]);
    public static final Parcelable.Creator CREATOR = new C163487tt();
    public int A00;
    public Bundle A01;
    public boolean A02 = false;
    public int[] A03;
    public final int A04;
    public final int A05;
    public final Bundle A06;
    public final CursorWindow[] A07;
    public final String[] A08;

    public void close() {
        synchronized (this) {
            if (!this.A02) {
                this.A02 = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A07;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z;
        try {
            if (this.A07.length > 0) {
                synchronized (this) {
                    z = this.A02;
                }
                if (!z) {
                    close();
                    String obj = toString();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    A0o.append(obj);
                    A0o.append(")");
                    Log.e("DataBuffer", A0o.toString());
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public DataHolder(Bundle bundle, CursorWindow[] cursorWindowArr, String[] strArr, int i, int i2) {
        this.A04 = i;
        this.A08 = strArr;
        this.A07 = cursorWindowArr;
        this.A05 = i2;
        this.A06 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0G(parcel, this.A08, 1);
        C162417s1.A0F(parcel, this.A07, 2, i);
        C162417s1.A07(parcel, 3, this.A05);
        C162417s1.A02(this.A06, parcel, 4);
        C162417s1.A07(parcel, 1000, this.A04);
        C162417s1.A06(parcel, A002);
        if ((i & 1) != 0) {
            close();
        }
    }
}
