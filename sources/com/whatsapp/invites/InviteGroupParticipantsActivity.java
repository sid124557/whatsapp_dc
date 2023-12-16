package com.whatsapp.invites;

import X.AnonymousClass001;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass2QD;
import X.AnonymousClass34R;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZH;
import X.AnonymousClass4HY;
import X.AnonymousClass4JT;
import X.AnonymousClass4WY;
import X.AnonymousClass547;
import X.AnonymousClass5YT;
import X.AnonymousClass5ZU;
import X.C005205m;
import X.C105365Uq;
import X.C105895Wv;
import X.C106905aM;
import X.C107695bk;
import X.C109725f5;
import X.C114015mM;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C27991fJ;
import X.C33421sy;
import X.C379524r;
import X.C56072rN;
import X.C56982ss;
import X.C58422vE;
import X.C613330g;
import X.C620733j;
import X.C621033m;
import X.C626936e;
import X.C627336j;
import X.C627736r;
import X.C64333Db;
import X.C64773Ex;
import X.C89644eZ;
import X.C95814uZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InviteGroupParticipantsActivity extends C89644eZ {
    public ImageView A00;
    public C621033m A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C105365Uq A04;
    public C114015mM A05;
    public C613330g A06;
    public C620733j A07;
    public C56982ss A08;
    public AnonymousClass3ZH A09;
    public MentionableEntry A0A;
    public C56072rN A0B;
    public List A0C;
    public boolean A0D;
    public byte[] A0E;

    public void A5r() {
        if (!this.A0D) {
            this.A0D = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A08 = C64333Db.A39(A002);
            this.A01 = C64333Db.A08(A002);
            this.A05 = C64333Db.A29(A002);
            this.A02 = C64333Db.A26(A002);
            this.A03 = C64333Db.A28(A002);
            this.A07 = C64333Db.A2t(A002);
            this.A0B = C64333Db.A8w(A002);
            this.A06 = (C613330g) A002.A6S.get();
        }
    }

    public final void A74(C27991fJ r4, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty() && this.A0D.A0Y(C58422vE.A02, 4136)) {
            startActivity(C627736r.A0X(this, r4, arrayList, getIntent().getIntExtra("invite_trigger_source", 0), false));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        setContentView((int) R.layout.f8nameremoved);
        LayoutInflater from = LayoutInflater.from(this);
        this.A04 = this.A05.A06(this, "invite-group-participants-activity");
        this.A0A = (MentionableEntry) findViewById(R.id.comment);
        getWindow().setSoftInputMode(3);
        this.A0A.requestFocus();
        TextView A0L = C18310x6.A0L(this, R.id.group_name);
        this.A00 = (ImageView) findViewById(R.id.group_photo);
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = C627336j.A0B(UserJid.class, getIntent().getStringArrayListExtra("jids")).iterator();
        while (it.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(it);
            A0s.add(A0P);
            A0s2.add(this.A02.A0A(A0P));
        }
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("invite_hashes");
        long longExtra = getIntent().getLongExtra("invite_expiration", 0);
        C27991fJ A042 = AnonymousClass34R.A04(getIntent().getStringExtra("group_jid"));
        C626936e.A06(A042);
        boolean A062 = this.A0B.A06(A042);
        TextView A012 = C005205m.A01(this, R.id.group_invite_subtitle);
        int i = R.string.f11nameremoved;
        if (A062) {
            i = R.string.f11nameremoved;
        }
        A012.setText(i);
        MentionableEntry mentionableEntry = this.A0A;
        int i2 = R.string.f11nameremoved;
        if (A062) {
            i2 = R.string.f11nameremoved;
        }
        mentionableEntry.setText(i2);
        this.A0C = AnonymousClass001.A0s();
        for (int i3 = 0; i3 < stringArrayListExtra.size(); i3++) {
            this.A0C.add(new AnonymousClass2QD(A042, (UserJid) A0s.get(i3), stringArrayListExtra.get(i3), longExtra));
        }
        AnonymousClass3ZH A0A2 = this.A02.A0A(A042);
        this.A09 = A0A2;
        if (AnonymousClass5YT.A00(A0A2, this.A0D)) {
            A0L.setText(R.string.f11nameremoved);
            A012.setVisibility(8);
        } else {
            A0L.setText(this.A03.A0H(this.A09));
        }
        C18270x1.A0w(new C33421sy(this.A06, this.A09, this), this.A04);
        ArrayList<String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("sms_invites_jids");
        ImageView imageView = (ImageView) findViewById(R.id.send);
        C18270x1.A0d(this, imageView, this.A07, R.drawable.input_send);
        imageView.setOnClickListener(new AnonymousClass547(stringArrayListExtra2, this, A042, 24));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.invite_contacts_recycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1X(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C56982ss r13 = this.A08;
        AnonymousClass4WY r7 = new AnonymousClass4WY(this, from, this.A03, this.A04, this.A07, r13);
        r7.A00 = A0s2;
        r7.A05();
        recyclerView.setAdapter(r7);
        C106905aM.A04(C18310x6.A0L(this, R.id.send_invite_title));
        View findViewById = findViewById(R.id.container);
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass4JT(findViewById, 0, this));
        Intent A002 = C379524r.A00(getIntent());
        A002.setComponent(getIntent().getComponent());
        setResult(0, A002);
        findViewById(R.id.filler).setOnClickListener(new C109725f5((Object) this, (Object) stringArrayListExtra2, (Object) A042, 47));
        AnonymousClass1Ha.A1t(this);
    }

    public InviteGroupParticipantsActivity(int i) {
        this.A0D = false;
        AnonymousClass4HY.A00(this, 74);
    }

    public void onDestroy() {
        super.onDestroy();
        C105365Uq r0 = this.A04;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void onPause() {
        super.onPause();
        boolean A002 = C105895Wv.A00(this.A00);
        Window window = getWindow();
        int i = 3;
        if (A002) {
            i = 5;
        }
        window.setSoftInputMode(i);
    }

    public InviteGroupParticipantsActivity() {
        this(0);
    }
}
