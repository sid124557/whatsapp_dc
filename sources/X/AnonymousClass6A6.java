package X;

import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.6A6  reason: invalid class name */
public class AnonymousClass6A6 implements Comparator {
    public final int A00;

    public AnonymousClass6A6(int i) {
        this.A00 = i;
    }

    public static void A00(List list, int i) {
        Collections.sort(list, new AnonymousClass6A6(i));
    }

    public final int compare(Object obj, Object obj2) {
        long j;
        long j2;
        Integer num;
        switch (this.A00) {
            case 0:
                j = ((C1223664c) obj2).BDf();
                j2 = ((C1223664c) obj).BDf();
                break;
            case 1:
                j = ((AnonymousClass5QG) obj2).A00;
                j2 = ((AnonymousClass5QG) obj).A00;
                break;
            case 2:
                j = ((File) obj2).lastModified();
                j2 = ((File) obj).lastModified();
                break;
            case 3:
                j = ((C624134x) obj).A1L;
                j2 = ((C624134x) obj2).A1L;
                break;
            case 4:
                boolean z = obj instanceof C96934xH;
                Integer A0f = AnonymousClass001.A0f();
                Integer A0Z = C18290x4.A0Z();
                if (z) {
                    num = A0Z;
                } else {
                    num = Integer.MAX_VALUE;
                    if (obj instanceof C136836nL) {
                        num = A0f;
                    }
                }
                if (obj2 instanceof C96934xH) {
                    A0f = A0Z;
                } else if (!(obj2 instanceof C136836nL)) {
                    A0f = Integer.MAX_VALUE;
                }
                return AnonymousClass2A6.A00(num, A0f);
            case 5:
                return 0;
            case 6:
                return AnonymousClass2A6.A00(Integer.valueOf(((C53722nY) obj).A00), Integer.valueOf(((C53722nY) obj2).A00));
            case 7:
                return -Long.compare(((C624134x) obj).A0K, ((C624134x) obj2).A0K);
            case 8:
                C624134x r6 = (C624134x) obj;
                C624134x r7 = (C624134x) obj2;
                int compare = Long.compare(r6.A0K, r7.A0K);
                if (compare == 0) {
                    j = r6.A1M;
                    j2 = r7.A1M;
                    break;
                } else {
                    return compare;
                }
            case 9:
                return AnonymousClass2A6.A00(((C1230366u) obj).BAX(), ((C1230366u) obj2).BAX());
            case 10:
                C623534r r62 = (C623534r) obj;
                C623534r r72 = (C623534r) obj2;
                UserJid userJid = r62.A0A;
                AnonymousClass1fY r2 = AnonymousClass1fY.A00;
                if (AnonymousClass000.A1Y(userJid, r2)) {
                    return -1;
                }
                UserJid userJid2 = r72.A0A;
                if (AnonymousClass000.A1Y(userJid2, r2)) {
                    return 1;
                }
                if (r62.A03() > 0 && r72.A03() == 0) {
                    return -1;
                }
                if (r62.A03() == 0 && r72.A03() > 0) {
                    return 1;
                }
                if (userJid instanceof C135216kJ) {
                    return -1;
                }
                if (!(userJid2 instanceof C135216kJ)) {
                    return -Long.compare(r62.A05(), r72.A05());
                }
                return 1;
            case 11:
                return -Long.compare(((C102225Hy) obj).A00, ((C102225Hy) obj2).A00);
            default:
                return AnonymousClass2A6.A00(Long.valueOf(((AnonymousClass536) obj2).A01), Long.valueOf(((AnonymousClass536) obj).A01));
        }
        return Long.compare(j, j2);
    }
}
