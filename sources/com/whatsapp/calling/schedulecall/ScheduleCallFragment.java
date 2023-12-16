package com.whatsapp.calling.schedulecall;

import X.AnonymousClass001;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass5Z0;
import X.AnonymousClass695;
import X.AnonymousClass94W;
import X.C06560Yg;
import X.C106405Yw;
import X.C106775a9;
import X.C106885aK;
import X.C107145am;
import X.C107445bK;
import X.C109315eQ;
import X.C18280x3;
import X.C18310x6;
import X.C56612sH;
import X.C56972sr;
import X.C620733j;
import X.C626936e;
import X.C66543Lv;
import X.C86634Kw;
import X.C94584ra;
import X.C95814uZ;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.text.DateFormat;
import java.util.Calendar;

public class ScheduleCallFragment extends Hilt_ScheduleCallFragment {
    public int A00;
    public TimePickerDialog A01;
    public C56972sr A02;
    public WaEditText A03;
    public WaEditText A04;
    public WaEditText A05;
    public WaImageView A06;
    public WaTextView A07;
    public AnonymousClass94W A08;
    public AnonymousClass5Z0 A09;
    public C56612sH A0A;
    public C620733j A0B;
    public C66543Lv A0C;
    public C95814uZ A0D;
    public String A0E;
    public Calendar A0F;
    public boolean A0G;
    public boolean A0H;
    public final DatePickerDialog.OnDateSetListener A0I = new C106885aK(this, 0);
    public final TimePickerDialog.OnTimeSetListener A0J = new C106775a9(this, 0);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r4.booleanValue() != false) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.calling.schedulecall.ScheduleCallFragment A00(X.C95814uZ r3, java.lang.Boolean r4, int r5) {
        /*
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "chatJid"
            X.AnonymousClass0x2.A0v(r2, r3, r0)
            if (r4 == 0) goto L_0x0012
            boolean r0 = r4.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r1 = 1
        L_0x0013:
            java.lang.String r0 = "isVideo"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "entrypoint"
            r2.putInt(r0, r5)
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r0 = new com.whatsapp.calling.schedulecall.ScheduleCallFragment
            r0.<init>()
            r0.A0u(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.schedulecall.ScheduleCallFragment.A00(X.4uZ, java.lang.Boolean, int):com.whatsapp.calling.schedulecall.ScheduleCallFragment");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        super.A0w(bundle, view);
        Bundle A0H2 = A0H();
        this.A0D = C106405Yw.A02(A0H2, "chatJid");
        this.A0H = A0H2.getBoolean("isVideo");
        this.A00 = A0H2.getInt("entrypoint");
        if (this.A0D == null) {
            Log.w("ScheduleCallFragment chatJid is null");
            A1K();
            return;
        }
        A0T().A0j(new C107445bK(this, 1), this, "single_selection_dialog_result");
        this.A05 = (WaEditText) C06560Yg.A02(view, R.id.call_title);
        this.A06 = AnonymousClass0x9.A0L(view, R.id.call_type_icon);
        this.A07 = AnonymousClass0x7.A0L(view, R.id.call_type_text);
        this.A03 = (WaEditText) C06560Yg.A02(view, R.id.call_date);
        this.A04 = (WaEditText) C06560Yg.A02(view, R.id.call_time);
        Calendar instance = Calendar.getInstance();
        this.A0F = instance;
        instance.add(11, 1);
        int i = this.A0F.get(12) % 30;
        Calendar calendar = this.A0F;
        int i2 = 30 - i;
        if (i < 15) {
            i2 = -i;
        }
        calendar.add(12, i2);
        String A0n = AnonymousClass0x7.A0n(this, this.A02.A0D.A03(), new Object[1], 0, R.string.f11nameremoved);
        this.A0E = A0n;
        this.A05.setHint(A0n);
        AnonymousClass695.A00(this.A05, this, 0);
        C86634Kw.A1D(this.A05, this, R.string.f11nameremoved);
        Editable text = this.A05.getText();
        C626936e.A06(text);
        text.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(32)});
        this.A05.requestFocus();
        ((InputMethodManager) A0G().getSystemService("input_method")).showSoftInput(this.A05, 0);
        C109315eQ.A01(this.A03, this, 18);
        this.A03.setKeyListener((KeyListener) null);
        this.A03.setHint(DateFormat.getDateInstance(2, C620733j.A02(this.A0B)).format(this.A0F.getTime()));
        C109315eQ.A01(this.A04, this, 19);
        this.A04.setKeyListener((KeyListener) null);
        this.A04.setHint(C107145am.A03(this.A0B, this.A0F));
        C109315eQ.A01(this.A07, this, 15);
        WaImageView waImageView = this.A06;
        boolean z = this.A0H;
        int i3 = R.drawable.vec_action_voice_call;
        if (z) {
            i3 = R.drawable.vec_action_video_call;
        }
        waImageView.setImageResource(i3);
        WaTextView waTextView = this.A07;
        boolean z2 = this.A0H;
        int i4 = R.string.f11nameremoved;
        if (z2) {
            i4 = R.string.f11nameremoved;
        }
        waTextView.setText(i4);
        C109315eQ.A01(C06560Yg.A02(view, R.id.schedule_call_close_button), this, 16);
        C109315eQ.A01(C06560Yg.A02(view, R.id.create_call_button), this, 17);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Long l;
        super.onDismiss(dialogInterface);
        int A012 = C18280x3.A01(this.A0H ? 1 : 0);
        if (this.A0G) {
            l = C18310x6.A0f(this.A0F.getTimeInMillis(), System.currentTimeMillis());
        } else {
            l = null;
        }
        boolean z = this.A0G;
        int i = this.A00;
        C94584ra r1 = new C94584ra();
        r1.A00 = Boolean.valueOf(z);
        r1.A01 = Integer.valueOf(A012);
        r1.A02 = Integer.valueOf(i);
        r1.A03 = l;
        this.A09.A01.BhD(r1);
    }
}
