package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: X.7yn  reason: invalid class name and case insensitive filesystem */
public final class C166507yn implements Parcelable {
    public static final C166507yn A05 = new C166507yn((TreeMap) null, (TreeMap) null);
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(19);
    public final TreeMap A00;
    public final TreeMap A01;
    public final TreeMap A02;
    public final TreeMap A03;
    public final TreeMap A04;

    public C166507yn(TreeMap treeMap, TreeMap treeMap2) {
        this.A02 = treeMap;
        this.A00 = treeMap2;
        this.A01 = null;
        this.A03 = null;
        this.A04 = null;
    }

    public int A00(String str, int i) {
        Number A0p;
        TreeMap treeMap = this.A02;
        if (treeMap == null || (A0p = AnonymousClass0x9.A0p(str, treeMap)) == null) {
            return i;
        }
        return A0p.intValue();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        TreeMap treeMap = this.A02;
        TreeMap treeMap2 = this.A00;
        TreeMap treeMap3 = this.A01;
        TreeMap treeMap4 = this.A03;
        TreeMap treeMap5 = this.A04;
        Bundle A08 = AnonymousClass002.A08();
        if (treeMap != null) {
            Iterator A0u = AnonymousClass001.A0u(treeMap);
            while (A0u.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0u);
                A08.putInt(C18310x6.A0q(A0w), AnonymousClass0x2.A08(A0w));
            }
        }
        parcel.writeBundle(A08);
        Bundle A082 = AnonymousClass002.A08();
        if (treeMap2 != null) {
            Iterator A0u2 = AnonymousClass001.A0u(treeMap2);
            while (A0u2.hasNext()) {
                Map.Entry A0w2 = AnonymousClass001.A0w(A0u2);
                A082.putBoolean(C18310x6.A0q(A0w2), AnonymousClass001.A1Z(A0w2.getValue()));
            }
        }
        parcel.writeBundle(A082);
        Bundle A083 = AnonymousClass002.A08();
        if (treeMap3 != null) {
            Iterator A0u3 = AnonymousClass001.A0u(treeMap3);
            while (A0u3.hasNext()) {
                Map.Entry A0w3 = AnonymousClass001.A0w(A0u3);
                A083.putIntArray(C18310x6.A0q(A0w3), (int[]) A0w3.getValue());
            }
        }
        parcel.writeBundle(A083);
        Bundle A084 = AnonymousClass002.A08();
        if (treeMap4 != null) {
            Iterator A0u4 = AnonymousClass001.A0u(treeMap4);
            while (A0u4.hasNext()) {
                Map.Entry A0w4 = AnonymousClass001.A0w(A0u4);
                A084.putStringArrayList(C18310x6.A0q(A0w4), (ArrayList) A0w4.getValue());
            }
        }
        parcel.writeBundle(A084);
        Bundle A085 = AnonymousClass002.A08();
        if (treeMap5 != null) {
            Iterator A0u5 = AnonymousClass001.A0u(treeMap5);
            while (A0u5.hasNext()) {
                Map.Entry A0w5 = AnonymousClass001.A0w(A0u5);
                A085.putCharArray(C18310x6.A0q(A0w5), AnonymousClass0x9.A12(A0w5).toCharArray());
            }
        }
        parcel.writeBundle(A085);
    }

    public C166507yn(Parcel parcel) {
        Class<C166507yn> cls = C166507yn.class;
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet = readBundle.keySet();
        if (!keySet.isEmpty()) {
            this.A02 = new TreeMap();
            Iterator<String> it = keySet.iterator();
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                AnonymousClass0x2.A1I(A0m, this.A02, readBundle.getInt(A0m));
            }
        } else {
            this.A02 = null;
        }
        Bundle readBundle2 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet2 = readBundle2.keySet();
        if (!keySet2.isEmpty()) {
            this.A00 = new TreeMap();
            Iterator<String> it2 = keySet2.iterator();
            while (it2.hasNext()) {
                String A0m2 = AnonymousClass001.A0m(it2);
                this.A00.put(A0m2, Boolean.valueOf(readBundle2.getBoolean(A0m2)));
            }
        } else {
            this.A00 = null;
        }
        Bundle readBundle3 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet3 = readBundle3.keySet();
        if (!keySet3.isEmpty()) {
            this.A01 = new TreeMap();
            Iterator<String> it3 = keySet3.iterator();
            while (it3.hasNext()) {
                String A0m3 = AnonymousClass001.A0m(it3);
                this.A01.put(A0m3, readBundle3.getIntArray(A0m3));
            }
        } else {
            this.A01 = null;
        }
        Bundle readBundle4 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet4 = readBundle4.keySet();
        if (!keySet4.isEmpty()) {
            this.A03 = new TreeMap();
            Iterator<String> it4 = keySet4.iterator();
            while (it4.hasNext()) {
                String A0m4 = AnonymousClass001.A0m(it4);
                this.A03.put(A0m4, readBundle4.getStringArrayList(A0m4));
            }
        } else {
            this.A03 = null;
        }
        Bundle readBundle5 = parcel.readBundle(cls.getClassLoader());
        Set<String> keySet5 = readBundle5.keySet();
        if (!keySet5.isEmpty()) {
            this.A04 = new TreeMap();
            Iterator<String> it5 = keySet5.iterator();
            while (it5.hasNext()) {
                String A0m5 = AnonymousClass001.A0m(it5);
                this.A04.put(A0m5, new String(readBundle5.getCharArray(A0m5)));
            }
            return;
        }
        this.A04 = null;
    }
}
