package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.conversation.selectlist.SelectListBottomSheet;

/* renamed from: X.5km  reason: invalid class name and case insensitive filesystem */
public final class C113035km implements C182268o8 {
    public final C69263Wi A00;

    public C113035km(C69263Wi r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public void Bgi(Context context, C624134x r5, AnonymousClass39W r6, int i) {
        C18260x0.A0O(context, r5);
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("arg_select_list_content", r6);
        SelectListBottomSheet selectListBottomSheet = new SelectListBottomSheet();
        selectListBottomSheet.A0u(A08);
        selectListBottomSheet.A00 = new C113295lC(context, this, r5);
        Activity A002 = C621633u.A00(context);
        if (A002 != null) {
            C86644Kx.A1C(selectListBottomSheet, (C003203q) A002);
        }
    }
}
