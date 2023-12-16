package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.calling.callhistory.CallLogActivity;
import com.whatsapp.calling.callhistory.view.CallsHistoryClearCallLogDialogFragment;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.community.CommunityDeleteDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.69y  reason: invalid class name and case insensitive filesystem */
public class C1238369y implements C16910uE {
    public Object A00;
    public final int A01;

    public C1238369y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r14) {
        AnonymousClass0R2 r0;
        switch (this.A01) {
            case 0:
                if (menuItem.getItemId() == R.id.menuitem_clear_selected_calls_from_call_log) {
                    CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                    if (callLogActivity.A0d != null) {
                        HashSet hashSet = callLogActivity.A0n;
                        if (!hashSet.isEmpty()) {
                            StringBuilder A0o = AnonymousClass001.A0o();
                            C18260x0.A19("callLogActivity/onActionItemClicked/delete: Deleting ", A0o, hashSet);
                            A0o.append(" out of ");
                            A0o.append(callLogActivity.A0d.size());
                            C18260x0.A1J(A0o, " calls");
                            callLogActivity.A0P.A0B(AnonymousClass002.A0J(hashSet));
                            callLogActivity.A0d.removeAll(hashSet);
                            ArrayList arrayList = callLogActivity.A0d;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                r0 = callLogActivity.A07;
                                break;
                            } else {
                                callLogActivity.finish();
                                return true;
                            }
                        }
                    }
                    if (callLogActivity.A0d == null) {
                        Log.e("callLogActivity/onActionItemClicked/delete: Calls are null");
                    }
                    if (!callLogActivity.A0n.isEmpty()) {
                        return true;
                    }
                    Log.e("callLogActivity/onActionItemClicked/delete: no calls selected");
                    return true;
                } else if (menuItem.getItemId() != R.id.menuitem_call_log_bugnub) {
                    return false;
                } else {
                    CallLogActivity callLogActivity2 = (CallLogActivity) this.A00;
                    callLogActivity2.startActivity(C627736r.A0I(callLogActivity2, (Uri) null, callLogActivity2.A00, true));
                    return true;
                }
            case 1:
                int itemId = menuItem.getItemId();
                if (itemId == R.id.menuitem_calls_delete) {
                    CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = callsHistoryFragmentV2.A0G;
                    HashMap hashMap = callsHistoryFragmentV2.A13;
                    Set keySet = new HashMap(hashMap).keySet();
                    AnonymousClass7D8 r6 = new AnonymousClass7D8(callsHistoryFragmentV2ViewModel);
                    Lock lock = callsHistoryFragmentV2ViewModel.A0r;
                    C56762sW r7 = callsHistoryFragmentV2ViewModel.A0c;
                    AnonymousClass5ZM.A05(callsHistoryFragmentV2ViewModel, new AnonymousClass55A(callsHistoryFragmentV2ViewModel.A0L, r6, r7, callsHistoryFragmentV2ViewModel.A0o, callsHistoryFragmentV2ViewModel.A0q, keySet, lock));
                    hashMap.clear();
                    callsHistoryFragmentV2.A0F.A09 = hashMap.keySet();
                    r0 = callsHistoryFragmentV2.A03;
                    break;
                } else if (itemId != R.id.menuitem_clear_call_log) {
                    return false;
                } else {
                    new CallsHistoryClearCallLogDialogFragment().A1O(((C08310eF) this.A00).A0U(), (String) null);
                    return false;
                }
            case 2:
                C162457s7.A0J(menuItem, 1);
                if (menuItem.getItemId() != R.id.menuitem_delete) {
                    return false;
                }
                AnonymousClass5K8 r1 = (AnonymousClass5K8) this.A00;
                ArrayList A0J = AnonymousClass002.A0J(((C51422jn) r1.A05.A07()).A00);
                Bundle A08 = AnonymousClass002.A08();
                C86644Kx.A0r(A08, "selectedParentJids", A0J);
                CommunityDeleteDialogFragment communityDeleteDialogFragment = new CommunityDeleteDialogFragment();
                communityDeleteDialogFragment.A0u(A08);
                ((C89654ea) C111095hX.A01(r1.A01)).Boo(communityDeleteDialogFragment);
                return true;
            default:
                return false;
        }
        if (r0 == null) {
            return true;
        }
        r0.A05();
        return true;
    }

    public boolean BQL(Menu menu, AnonymousClass0R2 r7) {
        int i;
        int i2;
        switch (this.A01) {
            case 0:
                ((CallLogActivity) this.A00).A77(menu);
                i = R.id.menuitem_clear_selected_calls_from_call_log;
                i2 = R.string.f11nameremoved;
                break;
            case 1:
                if ((menu instanceof C07890cz) && C106545Zk.A00(((CallsHistoryFragmentV2) this.A00).A0Y)) {
                    ((C07890cz) menu).A0H = true;
                }
                C86624Kv.A0q(menu.add(0, R.id.menuitem_calls_delete, 0, R.string.f11nameremoved), R.drawable.ic_action_delete);
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                if (!C86634Kw.A1b(callsHistoryFragmentV2.A0Y)) {
                    return true;
                }
                menu.add(0, R.id.menuitem_clear_call_log, 0, R.string.f11nameremoved).setIcon(AnonymousClass5B7.A00(callsHistoryFragmentV2, R.drawable.ic_settings_delete)).setShowAsAction(0);
                return true;
            case 2:
                C162457s7.A0J(menu, 1);
                i = R.id.menuitem_delete;
                i2 = R.string.f11nameremoved;
                break;
            default:
                C113245l7 r2 = (C113245l7) this.A00;
                View A0F = C86604Kt.A0F(LayoutInflater.from(r2.A2z.getSupportActionBar().A02()), R.layout.f8nameremoved);
                r7.A09(A0F);
                if (r2.A4E.A0F() && (C113245l7.A09(r2) instanceof C89154bn)) {
                    ((C89154bn) C113245l7.A09(r2)).A7B(8);
                }
                WaEditText waEditText = (WaEditText) A0F.findViewById(R.id.search_src_text);
                r2.A1m = waEditText;
                if (waEditText == null) {
                    return false;
                }
                waEditText.setOnFocusChangeListener(new C1892090k(this, 3));
                r2.A1m.addTextChangedListener(r2.A6s);
                r2.A1m.setOnEditorActionListener(new AnonymousClass68Y(this, 2));
                View A02 = C06560Yg.A02(A0F, R.id.search_up);
                r2.A0N = A02;
                C18290x4.A1G(A02, this, 9);
                View A022 = C06560Yg.A02(A0F, R.id.search_down);
                r2.A0L = A022;
                C18290x4.A1G(A022, this, 10);
                r2.A0O = C06560Yg.A02(A0F, R.id.search_up_progress_bar);
                r2.A0M = C06560Yg.A02(A0F, R.id.search_down_progress_bar);
                r2.A1m.setText(r2.A3B.A0J);
                r2.A1m.selectAll();
                r2.A1m.requestFocus();
                r2.A1m.setSelected(true);
                return true;
        }
        C86624Kv.A0q(menu.add(0, i, 0, i2), R.drawable.ic_action_delete);
        return true;
    }

    public void BQw(AnonymousClass0R2 r6) {
        switch (this.A01) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (!callLogActivity.isFinishing()) {
                    callLogActivity.A0n.clear();
                    callLogActivity.A0i.notifyDataSetChanged();
                    callLogActivity.A07 = null;
                    return;
                }
                return;
            case 1:
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                HashMap hashMap = callsHistoryFragmentV2.A13;
                if (!hashMap.isEmpty()) {
                    Iterator A10 = C18290x4.A10(hashMap);
                    while (A10.hasNext()) {
                        ((AnonymousClass4Z5) A10.next()).A07(false);
                    }
                    hashMap.clear();
                    callsHistoryFragmentV2.A0F.A09 = hashMap.keySet();
                    RecyclerView recyclerView = callsHistoryFragmentV2.A05;
                    C626936e.A04(recyclerView);
                    recyclerView.A0Z(0);
                }
                callsHistoryFragmentV2.A03 = null;
                return;
            case 2:
                AnonymousClass5K8 r1 = (AnonymousClass5K8) this.A00;
                ((C51422jn) r1.A05.A07()).A01.invoke();
                r1.A00 = null;
                return;
            default:
                r6.A09((View) null);
                C113245l7 r0 = (C113245l7) this.A00;
                r0.A0q = null;
                r0.A13();
                return;
        }
    }

    public boolean BYg(Menu menu, AnonymousClass0R2 r8) {
        C003203q r2;
        View view;
        switch (this.A01) {
            case 0:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                Locale A02 = C620733j.A02(callLogActivity.A00);
                Object[] A0L = AnonymousClass002.A0L();
                AnonymousClass000.A1L(A0L, callLogActivity.A0n.size());
                r8.A0B(String.format(A02, "%d", A0L));
                return true;
            case 1:
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                if (callsHistoryFragmentV2.A16()) {
                    HashMap hashMap = callsHistoryFragmentV2.A13;
                    if (!hashMap.isEmpty()) {
                        Locale A022 = C620733j.A02(callsHistoryFragmentV2.A0T);
                        Object[] objArr = new Object[1];
                        AnonymousClass000.A1P(objArr, hashMap.size(), 0);
                        r8.A0B(String.format(A022, "%d", objArr));
                        C003203q A0R = callsHistoryFragmentV2.A0R();
                        view = A0R.findViewById(R.id.action_mode_bar);
                        r2 = A0R;
                        break;
                    } else {
                        r8.A05();
                        return true;
                    }
                } else {
                    Log.w("CallsHistoryFragmentV2/onPrepareActionMode not attached to an activity");
                    return false;
                }
            case 2:
                C162457s7.A0J(r8, 0);
                AnonymousClass5K8 r4 = (AnonymousClass5K8) this.A00;
                Locale A023 = C620733j.A02(r4.A04);
                Object[] objArr2 = new Object[1];
                AnonymousClass000.A1P(objArr2, ((C51422jn) r4.A05.A07()).A00.size(), 0);
                r8.A0B(C86654Ky.A0n(A023, "%d", Arrays.copyOf(objArr2, 1)));
                C009707r r22 = r4.A01;
                view = C18290x4.A0N(r22, R.id.action_mode_bar);
                r2 = r22;
                break;
            default:
                return false;
        }
        C111095hX.A07(view, r2.getWindowManager());
        return true;
    }
}
