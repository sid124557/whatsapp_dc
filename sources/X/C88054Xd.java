package X;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* renamed from: X.4Xd  reason: invalid class name and case insensitive filesystem */
public class C88054Xd extends AnonymousClass0O5 {
    public final /* synthetic */ MaterialButton A00;
    public final /* synthetic */ MaterialCalendar A01;
    public final /* synthetic */ AnonymousClass4X1 A02;

    public C88054Xd(MaterialButton materialButton, MaterialCalendar materialCalendar, AnonymousClass4X1 r3) {
        this.A01 = materialCalendar;
        this.A02 = r3;
        this.A00 = materialButton;
    }

    public void A04(RecyclerView recyclerView, int i, int i2) {
        int A1J;
        MaterialCalendar materialCalendar = this.A01;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) materialCalendar.A05.getLayoutManager();
        if (i < 0) {
            A1J = linearLayoutManager.A1H();
        } else {
            A1J = linearLayoutManager.A1J();
        }
        Calendar calendar = this.A02.A01.A06.A06;
        Calendar A012 = C161097oz.A01(calendar);
        A012.add(2, A1J);
        materialCalendar.A0A = new C117045rI(A012);
        MaterialButton materialButton = this.A00;
        Calendar A013 = C161097oz.A01(calendar);
        A013.add(2, A1J);
        C117045rI r1 = new C117045rI(A013);
        String str = r1.A00;
        if (str == null) {
            str = DateUtils.formatDateTime((Context) null, r1.A06.getTimeInMillis(), 8228);
        }
        materialButton.setText(str);
    }

    public void A05(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.A00.getText());
        }
    }
}
