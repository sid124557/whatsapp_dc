package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.R;
import com.whatsapp.wds.components.toggle.WDSSwitch;

/* renamed from: X.5XG  reason: invalid class name */
public final class AnonymousClass5XG {
    public TextView A00;
    public TextView A01;
    public SwitchCompat A02;
    public final Context A03;
    public final C107265az A04 = new C107265az(this, 1);
    public final C107265az A05 = new C107265az(this, 2);
    public final C89364cO A06;
    public final C621033m A07;
    public final C106995aW A08;
    public final AnonymousClass5UK A09;
    public final C56982ss A0A;
    public final C95814uZ A0B;

    public final void A00() {
        View.OnClickListener r1;
        AnonymousClass31A A002 = C56982ss.A00(this.A0A, this.A0B);
        C89364cO r4 = this.A06;
        if (r4 != null) {
            C106995aW r12 = this.A08;
            if (r12.A0J && A002 != null) {
                this.A01 = C18300x5.A0G(r4, R.id.list_item_title);
                this.A00 = C18300x5.A0G(r4, R.id.list_item_description);
                this.A02 = (SwitchCompat) r4.findViewById(R.id.chat_lock_view_switch);
                AnonymousClass1VX r13 = r12.A04;
                if (!r13.A0X(5337)) {
                    int i = 0;
                    r4.setVisibility(0);
                    SwitchCompat switchCompat = this.A02;
                    if (switchCompat != null) {
                        switchCompat.setVisibility(8);
                    }
                    if (!A002.A0i || A002.A0j) {
                        if (r4 instanceof ListItemWithLeftIcon) {
                            ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) r4;
                            listItemWithLeftIcon.setTitleTextColor(C18300x5.A03(this.A03, R.attr.f3nameremoved, R.color.f5nameremoved));
                            if (!A002.A0j) {
                                i = 8;
                            }
                            listItemWithLeftIcon.setDescriptionVisibility(i);
                        } else if (r4 instanceof ListItemWithRightIcon) {
                            ListItemWithRightIcon listItemWithRightIcon = (ListItemWithRightIcon) r4;
                            if (!A002.A0j) {
                                i = 8;
                            }
                            listItemWithRightIcon.setDescriptionVisibility(i);
                        }
                        r1 = new C109315eQ(this, 31);
                    } else {
                        if (r4 instanceof ListItemWithLeftIcon) {
                            ListItemWithLeftIcon listItemWithLeftIcon2 = (ListItemWithLeftIcon) r4;
                            listItemWithLeftIcon2.setTitleTextColor(AnonymousClass0Y8.A04(this.A03, R.color.f5nameremoved));
                            listItemWithLeftIcon2.setDescriptionVisibility(8);
                        }
                        if (r4 instanceof ListItemWithRightIcon) {
                            ((ListItemWithRightIcon) r4).setDescriptionVisibility(8);
                        }
                        r1 = new AnonymousClass54D(this, 9);
                    }
                    r4.setOnClickListener(r1);
                } else if (r13.A0X(5498)) {
                    Context context = this.A03;
                    Activity A022 = C111095hX.A02(context);
                    C162457s7.A0K(A022, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
                    if (this.A02 == null && r13.A0X(5337)) {
                        LinearLayout.LayoutParams A0C = C86624Kv.A0C();
                        WDSSwitch wDSSwitch = new WDSSwitch(context, (AttributeSet) null, R.attr.f3nameremoved);
                        wDSSwitch.setId(R.id.chat_lock_view_switch);
                        wDSSwitch.setLayoutParams(A0C);
                        if (this.A02 == null) {
                            if (r4 instanceof ListItemWithLeftIcon) {
                                ((ListItemWithLeftIcon) r4).A07(wDSSwitch);
                            } else if (r4 instanceof ListItemWithRightIcon) {
                                C86644Kx.A0I(r4, R.id.left_view_container).addView(wDSSwitch);
                            }
                        }
                        this.A02 = wDSSwitch;
                    }
                    r4.setVisibility(0);
                    SwitchCompat switchCompat2 = this.A02;
                    if (switchCompat2 != null) {
                        switchCompat2.setChecked(A002.A0j);
                    }
                    SwitchCompat switchCompat3 = this.A02;
                    if (switchCompat3 != null) {
                        C18320x8.A16(switchCompat3, this, A022, 32);
                    }
                    TextView textView = this.A00;
                    if (textView != null) {
                        textView.setText(R.string.f11nameremoved);
                    }
                } else {
                    r4.setVisibility(8);
                }
            }
        }
    }

    public AnonymousClass5XG(Context context, C89364cO r4, C621033m r5, C106995aW r6, AnonymousClass5UK r7, C56982ss r8, C95814uZ r9) {
        C18260x0.A0f(r8, r5, r7, r6, context);
        C162457s7.A0J(r9, 6);
        this.A0A = r8;
        this.A07 = r5;
        this.A09 = r7;
        this.A08 = r6;
        this.A03 = context;
        this.A0B = r9;
        this.A06 = r4;
    }
}
