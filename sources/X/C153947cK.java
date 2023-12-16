package X;

import android.content.Context;
import android.util.SparseArray;
import com.whatsapp.R;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7cK  reason: invalid class name and case insensitive filesystem */
public class C153947cK {
    public static C04670Qe A00(Context context, C17370vQ r14, C17130uc r15, AnonymousClass7r0 r16, C156397gY r17, String str) {
        Context context2 = context;
        C162457s7.A0J(context, 0);
        String str2 = str;
        C18270x1.A10(str2, 1, r14);
        C04670Qe r2 = new C04670Qe(new AnonymousClass6N6(context), str2);
        SparseArray A0I = AnonymousClass6CA.A0I();
        A0I.put(R.id.cds_bottom_sheet_screen_data, r2);
        C47382dA r11 = ((BkCdsBottomSheetFragment) r14).A02;
        C09640gW r5 = (C09640gW) r15;
        SparseArray clone = r5.A03.clone();
        for (int i = 0; i < A0I.size(); i++) {
            clone.put(A0I.keyAt(i), A0I.valueAt(i));
        }
        Map map = r5.A09;
        int i2 = r5.A00;
        HashMap A0t = AnonymousClass001.A0t();
        A0t.putAll(map);
        String valueOf = String.valueOf(i2);
        A0t.put("ttrc_instance_id", valueOf);
        Map map2 = r5.A08;
        HashMap A0t2 = AnonymousClass001.A0t();
        A0t2.putAll(map2);
        A0t2.put("ttrc_instance_id", valueOf);
        AnonymousClass0Y5 r4 = new AnonymousClass0Y5(new C10110hP(context2, clone, r16, r11, A0t, A0t2), r5, r17);
        if (r4.A01 == null) {
            AnonymousClass0P9 r7 = r4.A03;
            C186468vN A02 = AnonymousClass0Y5.A02(r4.A05, r4.A06);
            r4.A01 = A02;
            A02.BKk("surface_core_created_at", r7.A00);
        }
        C186468vN r72 = r4.A01;
        C09640gW r1 = r4.A05;
        if (r1.A04 == null || r1.A0A) {
            r72.Awn("initial_content_step");
        } else {
            r72.Awl("bloks_query", TimeUnit.SECONDS, 86400);
        }
        if (r4.A00 == null) {
            r4.A0C(context2);
        }
        r4.A04.A0C(r4.A06(r14, r72));
        C186468vN r12 = r4.A01;
        r12.getClass();
        r12.BKc("cds_bottomsheet", true);
        r2.A00 = r4;
        return r2;
    }

    public static boolean A01(int i) {
        switch (i) {
            case 13317:
            case 13320:
            case 13323:
            case 13326:
            case 13327:
            case 13329:
            case 13334:
            case 13335:
            case 13336:
            case 13666:
            case 13708:
            case 13797:
            case 14093:
            case 15728:
            case 15778:
            case 15981:
            case 16160:
            case 16260:
            case 16444:
            case 16682:
                return true;
            default:
                return false;
        }
    }
}
