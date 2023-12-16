package X;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: X.1QL  reason: invalid class name */
public final class AnonymousClass1QL extends C56692sP {
    public C620733j A00;
    public Calendar A01;
    public final C111095hX A02;
    public final C44362Vt A03;
    public final C52312lH A04;
    public final C50862it A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final AnonymousClass33T A08;
    public final AnonymousClass33p A09;
    public final C66543Lv A0A;
    public final AnonymousClass2W4 A0B;
    public final C56832sd A0C;
    public final AnonymousClass1R1 A0D;
    public final C55832qz A0E;
    public final AnonymousClass4FS A0F;

    public static final void A00(Activity activity, DatePickerDialog.OnDateSetListener onDateSetListener, AnonymousClass1QL r11, int i) {
        int i2;
        Calendar instance = Calendar.getInstance();
        C162457s7.A0D(instance);
        r11.A01 = instance;
        int i3 = 11;
        if (i != 0) {
            if (i != 1) {
                i3 = 5;
                i2 = 7;
                if (i != 2) {
                    if (i == 3) {
                        int i4 = instance.get(1);
                        Calendar calendar = r11.A01;
                        if (calendar == null) {
                            throw C18270x1.A0S("reminderDateTime");
                        }
                        int i5 = calendar.get(2);
                        Calendar calendar2 = r11.A01;
                        if (calendar2 == null) {
                            throw C18270x1.A0S("reminderDateTime");
                        }
                        DatePickerDialog datePickerDialog = new DatePickerDialog(activity, onDateSetListener, i4, i5, calendar2.get(5));
                        datePickerDialog.setOnDateSetListener(onDateSetListener);
                        DatePicker datePicker = datePickerDialog.getDatePicker();
                        C162457s7.A0D(datePicker);
                        datePicker.setMinDate(Calendar.getInstance().getTimeInMillis());
                        datePickerDialog.show();
                        return;
                    } else if (i == 4) {
                        instance.add(13, 10);
                        return;
                    } else {
                        return;
                    }
                }
            } else {
                i2 = 24;
            }
            instance.add(i3, i2);
            return;
        }
        instance.add(11, 1);
    }

    public void A07(Activity activity, AnonymousClass2z0 r9, AnonymousClass398 r10) {
        Boolean bool;
        int i;
        int i2;
        C18270x1.A10(activity, 0, r9);
        if (activity instanceof AnonymousClass67A) {
            C627336j.A07(((AnonymousClass4FC) activity).getContact().A0I(C95814uZ.class));
        }
        C95814uZ r6 = r9.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        C54292oU r1 = this.A07;
        A0s.add(C54292oU.A04(r1, R.string.f11nameremoved));
        A0s.add(C54292oU.A04(r1, R.string.f11nameremoved));
        A0s.add(C54292oU.A04(r1, R.string.f11nameremoved));
        A0s.add(C54292oU.A04(r1, R.string.f11nameremoved));
        CharSequence[] charSequenceArr = (CharSequence[]) A0s.toArray(new CharSequence[0]);
        C107905c6 r5 = new C107905c6(activity, new C106775a9(this, 1), this);
        C19340zH A002 = AnonymousClass5V0.A00(activity);
        if (r6 != null) {
            bool = Boolean.valueOf(this.A0D.A0h(r6));
        } else {
            bool = null;
        }
        if (!this.A08.A00.A01()) {
            int i3 = R.string.f11nameremoved;
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            if (!C107385bE.A0A() || this.A09.A2O("android.permission.POST_NOTIFICATIONS")) {
                i3 = R.string.f11nameremoved;
            }
            C19340zH.A09(A002, activity, this, 12, i3);
            i2 = R.string.f11nameremoved;
            i = 5;
        } else if (AnonymousClass0x9.A1Q(bool)) {
            A002.A0U(R.string.f11nameremoved);
            A002.A0T(R.string.f11nameremoved);
            i = 6;
            A002.A0Y(new AnonymousClass69T(r6, 6, this), R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
        } else {
            A002.A0U(R.string.f11nameremoved);
            A002.A0Y(new AnonymousClass374(activity, this, r6, r9), R.string.f11nameremoved);
            A002.A0W(new AnonymousClass69A(7), R.string.f11nameremoved);
            A002.A00.A0K(new C1235668x(activity, r5, this, 4), charSequenceArr, -1);
            C18280x3.A0q(A002);
        }
        A002.A0W(new AnonymousClass69A(i), i2);
        C18280x3.A0q(A002);
    }

    public void A08(Activity activity, AnonymousClass2z0 r3, AnonymousClass398 r4, Class cls) {
        C162457s7.A0J(activity, 0);
        C18260x0.A0Q(r4, r3);
        A07(activity, r3, r4);
    }

    public AnonymousClass1QL(C111095hX r2, C44362Vt r3, C52312lH r4, C50862it r5, C56612sH r6, C54292oU r7, AnonymousClass33T r8, AnonymousClass33p r9, C66543Lv r10, AnonymousClass2W4 r11, C56832sd r12, AnonymousClass1R1 r13, C55832qz r14, AnonymousClass4FS r15) {
        C18260x0.A0f(r6, r5, r15, r7, r3);
        C18260x0.A0g(r2, r14, r13, r9, r12);
        C18270x1.A13(r8, r10);
        C162457s7.A0J(r11, 14);
        this.A06 = r6;
        this.A05 = r5;
        this.A0F = r15;
        this.A07 = r7;
        this.A03 = r3;
        this.A02 = r2;
        this.A0E = r14;
        this.A0D = r13;
        this.A09 = r9;
        this.A0C = r12;
        this.A08 = r8;
        this.A0A = r10;
        this.A04 = r4;
        this.A0B = r11;
    }

    public final void A0C(Activity activity) {
        Activity activity2 = activity;
        View inflate = View.inflate(activity, R.layout.f8nameremoved, (ViewGroup) null);
        TextView A0I = AnonymousClass0x2.A0I(inflate, R.id.permission_message);
        View A0E2 = C18280x3.A0E(inflate, R.id.submit);
        View A0E3 = C18280x3.A0E(inflate, R.id.cancel);
        A0I.setText(R.string.f11nameremoved);
        ((ImageView) C18280x3.A0E(inflate, R.id.permission_image_1)).setImageResource(R.drawable.clock_icon);
        C19340zH A002 = AnonymousClass5V0.A00(activity);
        A002.A0a(inflate);
        A002.A0i(false);
        AnonymousClass043 A0H = C18300x5.A0H(A002);
        Window window = A0H.getWindow();
        if (window != null) {
            C18310x6.A0x(activity, window, R.color.f5nameremoved);
        }
        A0E2.setOnClickListener(new C634839k(A0H, this, activity2, activity.getPackageName(), 1));
        A0E3.setOnClickListener(new C109345eT(A0H, 47));
        A0H.show();
    }
}
