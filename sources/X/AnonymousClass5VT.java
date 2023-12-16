package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.Mp4Ops;
import com.whatsapp.R;
import java.util.Formatter;

/* renamed from: X.5VT  reason: invalid class name */
public class AnonymousClass5VT {
    public static AnonymousClass5YG A00(Context context, C55682qk r17, C69263Wi r18, Mp4Ops mp4Ops, C153407bG r20, C620633i r21, C54292oU r22, AnonymousClass1VX r23, String str) {
        Context context2 = context;
        Activity A02 = C111095hX.A02(context2);
        Uri parse = Uri.parse(str);
        C138326q8 r11 = new C138326q8(r17, mp4Ops, r20, r22, C162387ry.A07(context2, context2.getString(R.string.f11nameremoved)));
        C138386qG r2 = new C138386qG(A02, r18, r21, r23, (C147457Ej) null, (C153387bE) null, 0, false);
        r2.A04 = parse;
        r2.A0i(r11);
        return r2;
    }

    public static String A01(StringBuilder sb, Formatter formatter, long j) {
        Object[] objArr;
        String str;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long A0B = C18290x4.A0B(j + 500);
        long j2 = A0B % 60;
        long j3 = (A0B / 60) % 60;
        long j4 = A0B / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            objArr = AnonymousClass0x9.A1X();
            AnonymousClass000.A1Q(objArr, 0, j4);
            AnonymousClass000.A1Q(objArr, 1, j3);
            AnonymousClass000.A1Q(objArr, 2, j2);
            str = "%d:%02d:%02d";
        } else {
            objArr = new Object[2];
            AnonymousClass000.A1Q(objArr, 0, j3);
            AnonymousClass000.A1Q(objArr, 1, j2);
            str = "%02d:%02d";
        }
        return formatter.format(str, objArr).toString();
    }
}
