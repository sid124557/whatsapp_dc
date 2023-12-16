package com.whatsapp.support.faq;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1He;
import X.AnonymousClass1XA;
import X.AnonymousClass2BI;
import X.AnonymousClass4BX;
import X.AnonymousClass4FV;
import X.AnonymousClass4OI;
import X.AnonymousClass5JW;
import X.AnonymousClass5Q6;
import X.AnonymousClass5WY;
import X.AnonymousClass67T;
import X.C166167yF;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C47362d8;
import X.C53202mi;
import X.C620633i;
import X.C626936e;
import X.C66663Mh;
import X.C70363aN;
import X.C71573cK;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SearchFAQ extends AnonymousClass1He implements AnonymousClass4BX {
    public int A00;
    public AnonymousClass5WY A01;
    public AnonymousClass4FV A02;
    public C53202mi A03;
    public C47362d8 A04;
    public AnonymousClass5Q6 A05;
    public String A06;
    public String A07;
    public String A08;
    public ArrayList A09;
    public HashMap A0A;
    public HashSet A0B;
    public List A0C;

    public void Ba0(boolean z) {
        A75(3);
        if (z) {
            C18290x4.A18(this);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb;
        if (i == 1) {
            if (i2 == -1) {
                long longExtra = intent.getLongExtra("total_time_spent", 0);
                long longExtra2 = intent.getLongExtra("article_id", -1);
                HashMap hashMap = this.A0A;
                Long valueOf = Long.valueOf(longExtra2);
                if (hashMap.containsKey(valueOf)) {
                    longExtra += C18310x6.A0B(this.A0A.get(valueOf));
                }
                AnonymousClass0x2.A1J(valueOf, this.A0A, longExtra);
                C18260x0.A10("search-faq/activity-result total time spent on last article opened is ", AnonymousClass001.A0o(), longExtra);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("search-faq/activity-result total time spent per article is ");
                C18260x0.A1J(A0o, TextUtils.join(", ", this.A0A.entrySet()));
                sb = AnonymousClass001.A0o();
                sb.append("search-faq/activity-result total time spend on all articles is ");
                Iterator A10 = C18290x4.A10(this.A0A);
                long j = 0;
                while (A10.hasNext()) {
                    j += C18270x1.A02(A10);
                }
                sb.append(j);
            } else {
                sb = AnonymousClass001.A0o();
                sb.append("search-faq/activity-result/result/");
                sb.append(i2);
            }
            AnonymousClass0x2.A18(sb);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        A75(2);
        super.onBackPressed();
    }

    public final void A75(int i) {
        AnonymousClass1XA r3 = new AnonymousClass1XA();
        r3.A00 = Integer.valueOf(i);
        r3.A01 = this.A00.A07();
        this.A04.BkM(new C71573cK(this, 36, r3));
    }

    public final void A76(AnonymousClass5JW r9) {
        HashSet hashSet = this.A0B;
        String str = r9.A03;
        hashSet.add(str);
        String str2 = r9.A02;
        String str3 = r9.A01;
        long j = r9.A00;
        Intent A072 = C18320x8.A07();
        A072.setClassName(getPackageName(), "com.whatsapp.support.faq.FaqItemActivity");
        A072.putExtra("title", str2);
        A072.putExtra("content", str3);
        A072.putExtra("url", str);
        A072.putExtra("article_id", j);
        startActivityForResult(A072, 1);
        overridePendingTransition(R.anim.f0nameremoved, R.anim.f0nameremoved);
    }

    public void onCreate(Bundle bundle) {
        Object obj;
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        int i = 0;
        boolean booleanExtra = getIntent().getBooleanExtra("com.whatsapp.support.faq.SearchFAQ.usePaymentsFlow", false);
        AnonymousClass1Ha.A1l(this, R.string.f11nameremoved).A0N(true);
        setContentView((int) R.layout.f8nameremoved);
        this.A0B = AnonymousClass002.A0K();
        if (bundle != null) {
            String[] stringArray = bundle2.getStringArray("FaqItemsReadTitles");
            if (stringArray != null) {
                Collections.addAll(this.A0B, stringArray);
            }
            if (bundle2.containsKey("timeSpentPerArticle")) {
                HashMap hashMap = (HashMap) bundle2.getSerializable("timeSpentPerArticle");
                this.A0A = hashMap;
                hashMap.size();
            }
        }
        Intent intent = getIntent();
        this.A06 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.from");
        ArrayList A0s = AnonymousClass001.A0s();
        if (this.A0A == null) {
            this.A0A = AnonymousClass001.A0t();
        }
        int intExtra = intent.getIntExtra("com.whatsapp.support.faq.SearchFAQ.count", 0);
        this.A00 = intExtra;
        if (booleanExtra) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("payments_support_faqs");
            ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("payments_support_topics");
            Bundle bundleExtra = intent.getBundleExtra("describe_problem_bundle");
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                C166167yF r0 = (C166167yF) it.next();
                A0s.add(new AnonymousClass5JW(Long.parseLong(r0.A01), r0.A02, r0.A00, r0.A03));
            }
            obj = new C70363aN(this, parcelableArrayListExtra2, bundleExtra, 19);
        } else {
            this.A07 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.problem");
            this.A08 = intent.getStringExtra("com.whatsapp.support.faq.SearchFAQ.status");
            this.A09 = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            String[] stringArrayExtra = intent.getStringArrayExtra("com.whatsapp.support.faq.SearchFAQ.additionalDetails");
            if (stringArrayExtra != null) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (String split : stringArrayExtra) {
                    String[] split2 = split.split(":");
                    if (split2.length == 2) {
                        AnonymousClass0x2.A1F(split2[0], split2[1], A0s2);
                    }
                }
                this.A0C = A0s2;
            }
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.titles");
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.descriptions");
            ArrayList<String> stringArrayListExtra3 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.urls");
            ArrayList<String> stringArrayListExtra4 = intent.getStringArrayListExtra("com.whatsapp.support.faq.SearchFAQ.ids");
            if (!(stringArrayListExtra == null || stringArrayListExtra2 == null || stringArrayListExtra3 == null || stringArrayListExtra4 == null)) {
                if (stringArrayListExtra.size() < intExtra) {
                    intExtra = stringArrayListExtra.size();
                }
                if (stringArrayListExtra2.size() < intExtra) {
                    intExtra = stringArrayListExtra2.size();
                }
                if (stringArrayListExtra3.size() < intExtra) {
                    intExtra = stringArrayListExtra3.size();
                }
                if (stringArrayListExtra4.size() < intExtra) {
                    intExtra = stringArrayListExtra4.size();
                }
                for (int i2 = 0; i2 < intExtra; i2++) {
                    long parseLong = Long.parseLong(stringArrayListExtra4.get(i2));
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("search-faq/result item=");
                    A0o.append(i2);
                    A0o.append(" title=");
                    A0o.append(stringArrayListExtra.get(i2));
                    A0o.append(" url=");
                    A0o.append(stringArrayListExtra3.get(i2));
                    C18260x0.A10(" id=", A0o, parseLong);
                    A0s.add(new AnonymousClass5JW(parseLong, stringArrayListExtra.get(i2), stringArrayListExtra2.get(i2), stringArrayListExtra3.get(i2)));
                }
            }
            obj = new C71573cK(this, 35, intent);
        }
        AnonymousClass4OI r8 = new AnonymousClass4OI(this, this, A0s);
        ListView listView = getListView();
        LayoutInflater A002 = C620633i.A00(this);
        C626936e.A06(A002);
        listView.addHeaderView(A002.inflate(R.layout.f8nameremoved, (ViewGroup) null), (Object) null, false);
        A74(r8);
        registerForContextMenu(listView);
        if (A0s.size() == 1) {
            A76((AnonymousClass5JW) A0s.get(0));
        }
        View findViewById = findViewById(R.id.bottom_button_container);
        AnonymousClass5Q6 r02 = new AnonymousClass5Q6(listView, findViewById, AnonymousClass1Ha.A1i(this));
        this.A05 = r02;
        r02.A00();
        this.A05.A01(this, new AnonymousClass67T(this, 1, obj), C18310x6.A0L(this, R.id.does_not_match_button), getString(R.string.f11nameremoved), R.style.f12nameremoved);
        C18280x3.A0o(this.A05.A01, obj, 24);
        if (AnonymousClass2BI.A00(this.A06) && this.A06.A08(C66663Mh.A0d)) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            HashSet hashSet = this.A0B;
            if (hashSet != null && hashSet.size() > 0) {
                bundle.putStringArray("FaqItemsReadTitles", C18280x3.A1b(this.A0B));
            }
            HashMap hashMap = this.A0A;
            if (hashMap != null && hashMap.size() > 0) {
                bundle.putSerializable("timeSpentPerArticle", hashMap);
            }
        }
        super.onSaveInstanceState(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A05.A00();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A75(2);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
