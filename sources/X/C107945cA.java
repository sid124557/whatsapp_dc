package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.textstatus.AddTextStatusActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5cA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C107945cA implements DialogInterface.OnClickListener {
    public final /* synthetic */ AnonymousClass4WZ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass4WZ r7 = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        dialogInterface.dismiss();
        List list = r7.A06;
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            C52892mD r1 = (C52892mD) it.next();
            if (C162457s7.A0P(r1.A02, str2) && C162457s7.A0P(r1.A03, str)) {
                break;
            }
            i2++;
        }
        list.remove(i2);
        if (list.size() > 0) {
            r7.A08(i2);
        }
        AddTextStatusActivity addTextStatusActivity = r7.A03.A00;
        List list2 = addTextStatusActivity.A0L;
        list2.remove(i2);
        if (list2.isEmpty()) {
            C18280x3.A0r(addTextStatusActivity, R.id.suggestions, C86644Kx.A04(addTextStatusActivity, R.id.suggestions_list));
        }
    }

    public /* synthetic */ C107945cA(AnonymousClass4WZ r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }
}
