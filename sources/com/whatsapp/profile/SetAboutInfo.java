package com.whatsapp.profile;

import X.AnonymousClass001;
import X.AnonymousClass1Hf;
import X.AnonymousClass2QL;
import X.AnonymousClass4EF;
import X.AnonymousClass4IL;
import X.AnonymousClass4OK;
import X.AnonymousClass4SG;
import X.AnonymousClass5V0;
import X.AnonymousClass5Yj;
import X.AnonymousClass681;
import X.AnonymousClass68J;
import X.AnonymousClass68W;
import X.C107335b8;
import X.C107405bG;
import X.C107695bk;
import X.C115235oL;
import X.C1235268t;
import X.C18300x5;
import X.C18320x8;
import X.C19340zH;
import X.C29421in;
import X.C40782Hs;
import X.C40792Ht;
import X.C54042o5;
import X.C54482on;
import X.C56602sG;
import X.C621433s;
import X.C633939b;
import X.C64333Db;
import X.C86614Ku;
import X.C86654Ky;
import X.C86664Kz;
import X.C89644eZ;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetAboutInfo extends C89644eZ implements AnonymousClass4EF {
    public static ArrayList A0A;
    public View A00;
    public C54042o5 A01;
    public TextEmojiLabel A02;
    public C29421in A03;
    public AnonymousClass4OK A04;
    public C54482on A05;
    public boolean A06;
    public boolean A07;
    public final Handler A08;
    public final C56602sG A09;

    public void BOP(int i) {
        if (i == 4) {
            this.A05.A00(2);
        }
    }

    public void BRm(int i, String str) {
        if (i == 4 && str.length() > 0 && !str.equals(C86614Ku.A0u(this.A02))) {
            this.A00.setOnClickListener((View.OnClickListener) null);
            A75(str);
            this.A05.A00(1);
        }
    }

    public Dialog onCreateDialog(int i) {
        String str;
        int i2;
        if (i == 0) {
            str = getString(R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
        } else if (i == 1) {
            str = getString(R.string.f11nameremoved);
            i2 = R.string.f11nameremoved;
        } else if (i == 2) {
            ProgressDialog progressDialog = new ProgressDialog(this);
            C18320x8.A0w(progressDialog, this, R.string.f11nameremoved);
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(false);
            return progressDialog;
        } else if (i != 3) {
            return super.onCreateDialog(i);
        } else {
            C19340zH A002 = AnonymousClass5V0.A00(this);
            A002.A0T(R.string.f11nameremoved);
            C1235268t.A03(A002, this, 78, R.string.f11nameremoved);
            C19340zH.A05(A002);
            return A002.create();
        }
        return ProgressDialog.show(this, str, getString(i2), true, false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, R.string.f11nameremoved);
        return true;
    }

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A01 = (C54042o5) A2Y.ANE.get();
            this.A05 = (C54482on) r1.A7A.get();
            this.A03 = C86614Ku.A0S(A2Y);
        }
    }

    public final void A74() {
        ObjectOutputStream objectOutputStream;
        try {
            objectOutputStream = new ObjectOutputStream(openFileOutput("status", 0));
            StringBuilder A0o = AnonymousClass001.A0o();
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                A0o.append(AnonymousClass001.A0m(it));
                A0o.append("\n");
            }
            if (A0o.length() > 1) {
                A0o.deleteCharAt(A0o.length() - 1);
            }
            objectOutputStream.writeObject(A0o.toString());
            objectOutputStream.close();
            return;
        } catch (IOException e) {
            Log.e("SetStatus/writeStatusListString", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public SetAboutInfo(int i) {
        this.A06 = false;
        AnonymousClass68W.A00(this, 76);
    }

    public void A75(String str) {
        if (!A6i(R.string.f11nameremoved)) {
            C621433s.A01(this, 2);
            C54042o5 r2 = this.A01;
            C40782Hs r3 = new C40782Hs(this);
            C115235oL r1 = new C115235oL(this);
            if (!r2.A0A.A0J(Message.obtain((Handler) null, 0, 29, 0, new AnonymousClass2QL(r3, new C40792Ht(this), r1, str)))) {
                Handler handler = this.A08;
                handler.removeMessages(0);
                handler.sendEmptyMessage(0);
            }
            this.A08.sendEmptyMessageDelayed(0, 32000);
        }
    }

    public void BNi(String str) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        if (menuItem.getItemId() == 1) {
            A0A.remove(adapterContextMenuInfo.position);
            this.A04.notifyDataSetChanged();
            A74();
            this.A05.A00(4);
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public void onCreate(Bundle bundle) {
        ObjectInputStream objectInputStream;
        super.onCreate(bundle);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Hf.A2E(this);
        setContentView((int) R.layout.f8nameremoved);
        View findViewById = findViewById(R.id.status_layout);
        this.A00 = findViewById;
        C633939b.A00(findViewById, this, 35);
        TextEmojiLabel A0z = C86664Kz.A0z(this, R.id.status_tv);
        this.A02 = A0z;
        A0z.A0K((List) null, this.A01.A00());
        if (C18300x5.A1V(getFilesDir(), "status")) {
            try {
                objectInputStream = new ObjectInputStream(openFileInput("status"));
                ArrayList A0s = AnonymousClass001.A0s();
                A0A = A0s;
                for (String str : ((String) objectInputStream.readObject()).split("\n")) {
                    if (str.length() > 0) {
                        A0s.add(str);
                    }
                }
                objectInputStream.close();
            } catch (ClassNotFoundException e) {
                Log.w("create/status/serialization_error", e);
            } catch (IOException e2) {
                Log.e((Throwable) e2);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            AbsListView absListView = (AbsListView) findViewById(R.id.list);
            absListView.setEmptyView(findViewById(R.id.list_empty));
            AnonymousClass4OK r0 = new AnonymousClass4OK(this, this, A0A);
            this.A04 = r0;
            absListView.setAdapter(r0);
            absListView.setOnItemClickListener(new AnonymousClass68J(this.A06, this, 0));
            registerForContextMenu(absListView);
            this.A03.A06(this.A09);
            C107335b8.A0E(C86654Ky.A0M(this, R.id.status_tv_edit_icon), C107405bG.A00(this, R.attr.f3nameremoved, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved)));
            return;
        }
        TypedArray obtainTypedArray = getResources().obtainTypedArray(R.array.f2nameremoved);
        try {
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (int i = 0; i < obtainTypedArray.length(); i++) {
                A0s2.add(obtainTypedArray.getString(i));
            }
            obtainTypedArray.recycle();
            A0A = A0s2;
            AbsListView absListView2 = (AbsListView) findViewById(R.id.list);
            absListView2.setEmptyView(findViewById(R.id.list_empty));
            AnonymousClass4OK r02 = new AnonymousClass4OK(this, this, A0A);
            this.A04 = r02;
            absListView2.setAdapter(r02);
            absListView2.setOnItemClickListener(new AnonymousClass68J(this.A06, this, 0));
            registerForContextMenu(absListView2);
            this.A03.A06(this.A09);
            C107335b8.A0E(C86654Ky.A0M(this, R.id.status_tv_edit_icon), C107405bG.A00(this, R.attr.f3nameremoved, AnonymousClass5Yj.A02(this, R.attr.f3nameremoved, R.color.f5nameremoved)));
            return;
        } catch (Throwable th2) {
            obtainTypedArray.recycle();
            throw th2;
        }
        throw th;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, R.string.f11nameremoved);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.A07(this.A09);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId != 16908332) {
                return super.onOptionsItemSelected(menuItem);
            }
            finish();
            return true;
        } else if (A0A.size() == 0) {
            Bot(R.string.f11nameremoved);
            return true;
        } else {
            C621433s.A01(this, 3);
            return true;
        }
    }

    public SetAboutInfo() {
        this(0);
        this.A08 = new Handler(Looper.getMainLooper(), new AnonymousClass4IL(this, 1));
        this.A09 = AnonymousClass681.A00(this, 34);
    }
}
