package X;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.35X  reason: invalid class name */
public class AnonymousClass35X {
    public static C102355In A03(C55832qz r5, C33141sV r6, Integer num, Long l, List list) {
        if (!(num == null || l == null)) {
            ArrayList A0s = AnonymousClass001.A0s();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C624134x A00 = C55122pp.A00(r5, C18270x1.A02(it));
                    if (A00 instanceof C30471mV) {
                        C30471mV r1 = (C30471mV) A00;
                        if (r1.A21()) {
                            A0s.add(AnonymousClass5VD.A00(r1, r6));
                        }
                    }
                }
            }
            return new C102355In(A0s, num.intValue(), l.longValue());
        }
        return null;
    }

    public static void A05(Activity activity, AnonymousClass4FU r7, AnonymousClass4FV r8, int i) {
        r7.Bow(new AnonymousClass3CW(activity, AnonymousClass297.A00(r8, i), i), (Object[]) null, R.string.f11nameremoved, R.string.f11nameremoved, R.string.f11nameremoved);
    }

    public static long A01(C61072zf r2, AnonymousClass1VX r3) {
        if (r3 == null) {
            return 10000000;
        }
        int A0O = r3.A0O(C58422vE.A02, 224);
        if (A0O == -1) {
            return Math.min((r2.A05() * 1) / 100, 50000000);
        }
        return ((long) A0O) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public static Cursor A02(AnonymousClass319 r6, C95814uZ r7, int i, int i2) {
        AnonymousClass4GK r4;
        Cursor cursor;
        String str;
        if (i != 0) {
            if (i == 1) {
                if (i2 == 0) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDDescCursor:");
                    String str2 = AnonymousClass2C8.A04;
                    String[] strArr = new String[1];
                    C18280x3.A1Q(strArr, 5, 0);
                    r4 = AnonymousClass319.A00(r6);
                    cursor = ((AnonymousClass3H0) r4).A03.A0E(str2, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SORT_ID_DESC", strArr);
                } else if (i2 == 1) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDAscCursor:");
                    String str3 = AnonymousClass2C8.A03;
                    String[] strArr2 = new String[1];
                    C18280x3.A1Q(strArr2, 5, 0);
                    r4 = AnonymousClass319.A00(r6);
                    cursor = ((AnonymousClass3H0) r4).A03.A0E(str3, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SORT_ID_ASC", strArr2);
                } else if (i2 == 2) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedBySizeCursor:");
                    r4 = AnonymousClass319.A00(r6);
                    if (C56952sp.A0H(r6.A0C)) {
                        str = AnonymousClass2C8.A02;
                    } else {
                        str = AnonymousClass2C8.A01;
                    }
                    String[] strArr3 = new String[1];
                    C18270x1.A1O(strArr3, 5);
                    cursor = C56862sg.A03(r4, str, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_SIZE", strArr3);
                } else if (i2 == 3) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByForwardingScoreCursor_INTERNAL_ONLY:");
                    String str4 = AnonymousClass2C8.A00;
                    String[] strArr4 = new String[1];
                    C18280x3.A1Q(strArr4, 3, 0);
                    r4 = AnonymousClass319.A00(r6);
                    try {
                        cursor = ((AnonymousClass3H0) r4).A03.A0E(str4, "GET_FORWARDED_MEDIA_AND_DOC_MESSAGES_SQL_ORDER_BY_FORWARDING_SCORE", strArr4);
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                } else {
                    throw AnonymousClass000.A0G("Unknown sort type: ", AnonymousClass001.A0o(), i2);
                }
                r4.close();
                return cursor;
            } else if (i != 2) {
                throw AnonymousClass000.A0G("Unknown gallery type: ", AnonymousClass001.A0o(), i);
            } else if (i2 == 0) {
                return r6.A08((C95814uZ) null, 5000000);
            } else {
                if (i2 == 1) {
                    return r6.A07((C95814uZ) null, 5000000);
                }
                if (i2 == 2) {
                    return r6.A06((C95814uZ) null, 5000000);
                }
                throw AnonymousClass000.A0G("Unknown sort type: ", AnonymousClass001.A0o(), i2);
            }
        } else if (i2 == 0) {
            return r6.A08(r7, -1);
        } else {
            if (i2 == 1) {
                return r6.A07(r7, -1);
            }
            if (i2 == 2) {
                return r6.A06(r7, -1);
            }
            throw AnonymousClass000.A0G("Unknown sort type: ", AnonymousClass001.A0o(), i2);
        }
    }

    public static long A00(C64393Dh r4, C104675Rx r5) {
        long A00 = C627536m.A00((AnonymousClass0QU) null, r4.A0G());
        r5.A01.A05("STORAGE_USAGE_MEDIA_SIZE", String.valueOf(A00));
        r5.A01("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME");
        return A00;
    }

    public static String A04(Context context, C620733j r10) {
        return AnonymousClass002.A0F(context, r10.A0K(new Object[]{String.format(AnonymousClass001.A0M(context).locale, "%d", new Object[]{5L})}, 283, 5), new Object[1], 0, R.string.f11nameremoved);
    }
}
