package com.whatsapp.dmsetting;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass1XE;
import X.AnonymousClass314;
import X.AnonymousClass34K;
import X.AnonymousClass352;
import X.AnonymousClass3ZV;
import X.AnonymousClass5QF;
import X.AnonymousClass5RU;
import X.C103895Ov;
import X.C107635bd;
import X.C111095hX;
import X.C1235468v;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18300x5;
import X.C1905297s;
import X.C51482jt;
import X.C56112rR;
import X.C56982ss;
import X.C620633i;
import X.C64773Ex;
import X.C66433Lk;
import X.C69263Wi;
import X.C86604Kt;
import X.C95814uZ;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.List;

public final class DisappearingMessagesSettingActivity extends C1905297s {
    public int A00;
    public ListItemWithLeftIcon A01;
    public ListItemWithLeftIcon A02;
    public AnonymousClass314 A03;
    public C56112rR A04;
    public AnonymousClass5QF A05;
    public C103895Ov A06;
    public AnonymousClass5RU A07;
    public C66433Lk A08;

    public void onCreate(Bundle bundle) {
        String A012;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        int i = 1;
        this.A00 = getIntent().getIntExtra("entry_point", 1);
        this.A02 = (ListItemWithLeftIcon) findViewById(R.id.dm_setting_default_message_timer_row);
        this.A01 = (ListItemWithLeftIcon) findViewById(R.id.dm_setting_chat_picker_row);
        Toolbar toolbar = (Toolbar) C18290x4.A0L(this, R.id.toolbar);
        C86604Kt.A11(this, toolbar, this.A00, R.drawable.ic_back);
        toolbar.setTitle((CharSequence) getString(R.string.f11nameremoved));
        toolbar.setBackgroundResource(AnonymousClass34K.A00(C18290x4.A0F(toolbar)));
        toolbar.setNavigationOnClickListener(new C1235468v(this, 2));
        toolbar.A0J(this, R.style.f12nameremoved);
        setSupportActionBar(toolbar);
        String A0l = C18290x4.A0l(this, R.string.f11nameremoved);
        AnonymousClass1VX r10 = this.A0D;
        C69263Wi r7 = this.A05;
        C111095hX r6 = this.A00;
        C620633i r9 = this.A08;
        C66433Lk r2 = this.A08;
        C162457s7.A0H(r2);
        C107635bd.A0E(this, r2.A04("chats", "about-disappearing-messages"), r6, r7, (TextEmojiLabel) C18290x4.A0L(this, R.id.dm_description), r9, r10, A0l, "learn-more");
        C56112rR r0 = this.A04;
        C162457s7.A0H(r0);
        Integer A052 = r0.A05();
        C162457s7.A0D(A052);
        int intValue = A052.intValue();
        if (intValue == 0) {
            A012 = getString(R.string.f11nameremoved);
        } else {
            A012 = AnonymousClass352.A01(this, intValue, false, false);
        }
        C162457s7.A0H(A012);
        ListItemWithLeftIcon listItemWithLeftIcon = this.A02;
        C162457s7.A0H(listItemWithLeftIcon);
        listItemWithLeftIcon.setDescription((CharSequence) A012);
        ListItemWithLeftIcon listItemWithLeftIcon2 = this.A02;
        if (listItemWithLeftIcon2 != null) {
            listItemWithLeftIcon2.setOnClickListener(new C1235468v(this, 0));
        }
        A74((List) null);
        ListItemWithLeftIcon listItemWithLeftIcon3 = this.A01;
        if (listItemWithLeftIcon3 != null) {
            listItemWithLeftIcon3.setOnClickListener(new C1235468v(this, 1));
        }
        if (this.A00 == 6) {
            i = 0;
        }
        AnonymousClass5QF r22 = this.A05;
        if (r22 != null) {
            AnonymousClass1XE r1 = new AnonymousClass1XE();
            r1.A00 = Integer.valueOf(i);
            r1.A01 = C18280x3.A0U(r22.A01.A05());
            r22.A02.BhD(r1);
            AnonymousClass5RU r3 = this.A07;
            if (r3 != null) {
                View view = this.A00;
                C162457s7.A0D(view);
                r3.A02(view, "disappearing_messages_storage", getIntent().getStringExtra("search_result_key"));
                return;
            }
            throw C18270x1.A0S("settingsSearchUtil");
        }
        throw C18270x1.A0S("ephemeralSettingLogger");
    }

    public final void A74(List list) {
        int i;
        String quantityString;
        ListItemWithLeftIcon listItemWithLeftIcon = this.A01;
        if (listItemWithLeftIcon != null) {
            AnonymousClass314 r0 = this.A03;
            if (r0 != null) {
                C56982ss r3 = r0.A02;
                r3.A0G();
                AnonymousClass3ZV r2 = r0.A01;
                synchronized (r2) {
                    Iterator it = r2.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        i += AnonymousClass001.A1W(r3.A04(((C51482jt) it.next()).A01)) ? 1 : 0;
                    }
                }
                C103895Ov r5 = this.A06;
                C162457s7.A0H(r5);
                int i2 = 0;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C95814uZ A0P = C18300x5.A0P(it2);
                        C56982ss r1 = r5.A05;
                        C64773Ex r02 = r5.A04;
                        C162457s7.A0H(A0P);
                        if (AnonymousClass352.A00(r02, r1, A0P) == 0) {
                            i2++;
                        }
                    }
                }
                int i3 = i + i2;
                if (i3 == 0) {
                    quantityString = getString(R.string.f11nameremoved);
                } else {
                    Resources resources = getResources();
                    Object[] A0L = AnonymousClass002.A0L();
                    C18270x1.A1Q(A0L, i3);
                    quantityString = resources.getQuantityString(R.plurals.f9nameremoved, i3, A0L);
                }
                C162457s7.A0H(quantityString);
                listItemWithLeftIcon.setDescription((CharSequence) quantityString);
                return;
            }
            throw C18270x1.A0S("conversationsManager");
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String A012;
        super.onActivityResult(i, i2, intent);
        if (intent == null) {
            return;
        }
        if (i == 1) {
            int intExtra = intent.getIntExtra("all_contacts_count", 0);
            C56112rR r0 = this.A04;
            C162457s7.A0H(r0);
            int i3 = r0.A05.A00().getInt("disappearing_mode_duration_for_chat_picker_int", 0);
            List A0r = C86604Kt.A0r(intent);
            C56112rR r02 = this.A04;
            C162457s7.A0H(r02);
            Integer A052 = r02.A05();
            C162457s7.A0D(A052);
            if (i2 == -1) {
                int intValue = A052.intValue();
                C103895Ov r6 = this.A06;
                C162457s7.A0H(r6);
                r6.A00(A0r, i3, intValue, intExtra, this.A00);
                C162457s7.A0D(this.A00);
                if (A0r.size() > 0) {
                    A74(A0r);
                    return;
                }
                return;
            }
            int intValue2 = A052.intValue();
            AnonymousClass5QF r03 = this.A05;
            if (r03 != null) {
                r03.A01(A0r, 2, intValue2, 0, intExtra, this.A00);
                return;
            }
            throw C18270x1.A0S("ephemeralSettingLogger");
        } else if (i == 100 && i2 == -1) {
            int intExtra2 = intent.getIntExtra("duration", 0);
            if (intExtra2 == 0) {
                A012 = getString(R.string.f11nameremoved);
            } else {
                A012 = AnonymousClass352.A01(this, intExtra2, false, false);
            }
            C162457s7.A0H(A012);
            ListItemWithLeftIcon listItemWithLeftIcon = this.A02;
            C162457s7.A0H(listItemWithLeftIcon);
            listItemWithLeftIcon.setDescription((CharSequence) A012);
        }
    }
}
