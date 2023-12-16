package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* renamed from: X.5aa  reason: invalid class name and case insensitive filesystem */
public final class C107035aa {
    public static final String[] A00() {
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        C73743g0.A0Y(A17, A01());
        C73743g0.A0Y(A17, A02());
        return C18280x3.A1b(A17);
    }

    public static final String[] A01() {
        ArrayList A0s = AnonymousClass001.A0s();
        if (!C107385bE.A0A() && !C107385bE.A08()) {
            A0s.add("android.permission.READ_EXTERNAL_STORAGE");
        }
        A0s.add("android.permission.CAMERA");
        if (!C107385bE.A08()) {
            A0s.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C18280x3.A1b(A0s);
    }

    public static final String[] A02() {
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        if (C107385bE.A0A()) {
            A0s.add("android.permission.READ_MEDIA_IMAGES");
            str = "android.permission.READ_MEDIA_VIDEO";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        A0s.add(str);
        if (C107385bE.A0B()) {
            A0s.add("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        if (!C107385bE.A08()) {
            A0s.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C18280x3.A1b(A0s);
    }

    public static final String[] A03() {
        String str;
        ArrayList A0s = AnonymousClass001.A0s();
        if (C107385bE.A0A()) {
            str = "android.permission.READ_MEDIA_AUDIO";
        } else {
            str = "android.permission.READ_EXTERNAL_STORAGE";
        }
        A0s.add(str);
        if (!C107385bE.A08()) {
            A0s.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return C18280x3.A1b(A0s);
    }

    public static final String[] A04() {
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        C73743g0.A0Y(A17, A02());
        C73743g0.A0Y(A17, A03());
        return C18280x3.A1b(A17);
    }

    public static final String[] A05() {
        return A04();
    }

    public static String[] A06(AbstractCollection abstractCollection) {
        abstractCollection.addAll(Arrays.asList(A04()));
        String[] strArr = new String[abstractCollection.size()];
        abstractCollection.toArray(strArr);
        return strArr;
    }
}
