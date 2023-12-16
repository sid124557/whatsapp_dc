package X;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reactions.ReactionsTrayViewModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.676  reason: invalid class name */
public interface AnonymousClass676 extends AnonymousClass677, AnonymousClass67A, C185428td, C185928uT, C184608sD, C835648x, AnonymousClass4CM, C182188o0, AnonymousClass4CO, C84454Ck, C84464Cl, C84524Cr, C184308ra, C182438oP, C182488oU, AnonymousClass8s7, AnonymousClass64R, C835949a {
    C835748y B0u();

    void B1j(AnonymousClass2z0 r1);

    boolean BH0();

    boolean BIc();

    void BKe(short s);

    void BKj(String str);

    void BNY();

    void BQZ();

    void BZs();

    void BdV();

    void BdW(Bundle bundle);

    Dialog BdX(int i);

    boolean BdY(Menu menu);

    boolean Bda(int i, KeyEvent keyEvent);

    boolean Bdb(int i, KeyEvent keyEvent);

    boolean Bdc(Menu menu);

    void Bde();

    void Bdf();

    Intent Bih(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z);

    void BjL();

    void Boo(DialogFragment dialogFragment);

    void Bp9(int i);

    void BpY(Intent intent, int i);

    AnonymousClass0R2 Bpz(C16910uE r1);

    boolean BqJ(MotionEvent motionEvent);

    Object BqK(Class cls);

    void Bqv(List list);

    View findViewById(int i);

    void finish();

    void finishAndRemoveTask();

    AnonymousClass1VX getAbProps();

    C89644eZ getActivity();

    C111095hX getActivityUtils();

    C105055Tk getAddContactLogUtil();

    C620433g getBusinessProfileManager();

    C56942so getCommunityChatManager();

    C44772Xk getContactAccessHelper();

    C64773Ex getContactManager();

    C114015mM getContactPhotos();

    View getContentView();

    AnonymousClass5R7 getConversationRowCustomizers();

    C105165Tv getConversationRowInflater();

    C66543Lv getCoreMessageStore();

    C55682qk getCrashLogs();

    AnonymousClass5Y0 getEmojiLoader();

    EmojiSearchProvider getEmojiSearchProvider();

    C55832qz getFMessageDatabase();

    C64393Dh getFMessageIO();

    AnonymousClass5JR getFirstDrawMonitor();

    Collection getForwardMessages();

    C69263Wi getGlobalUI();

    C66493Lq getGroupChatManager();

    C56072rN getGroupChatUtils();

    C56892sj getGroupParticipantsManager();

    C105895Wv getImeUtils();

    Intent getIntent();

    AnonymousClass5ND getInteractionPerfTracker();

    LayoutInflater getLayoutInflater();

    AnonymousClass0O9 getLifecycle();

    C15910sA getLifecycleOwner();

    C106715a2 getLinkifier();

    C106685Zz getLinkifyWeb();

    ListView getListView();

    C56972sr getMeManager();

    AnonymousClass5RC getMessageAudioPlayerFactory();

    C113895mA getMessageAudioPlayerProvider();

    PopupWindow.OnDismissListener getOnPopupWindowDismissListener();

    AnonymousClass9U4 getPaymentsManager();

    C186568vZ getQuickPerformanceLogger();

    ReactionsTrayViewModel getReactionsTrayViewModel();

    C51072jE getRegistrationStateManager();

    Resources getResources();

    C17310vJ getSavedStateRegistryOwner();

    C29321id getScreenLockStateProvider();

    HashSet getSeenMessages();

    AnonymousClass5QO getSelectedMessages();

    AnonymousClass0R2 getSelectionActionMode();

    C66663Mh getServerProps();

    C56592sF getStartupTracker();

    AnonymousClass33O getStickerImageFileLoader();

    C61072zf getStorageUtils();

    String getString(int i);

    String getString(int i, Object... objArr);

    AnonymousClass0R8 getSupportActionBar();

    C08270df getSupportFragmentManager();

    C53202mi getSupportGatingUtils();

    C52472lX getSuspensionManager();

    C620633i getSystemServices();

    C56612sH getTime();

    C621033m getUserActions();

    C15940sD getViewModelStoreOwner();

    AnonymousClass5ZU getWAContactNames();

    C54292oU getWAContext();

    AnonymousClass5ZR getWaPermissionsHelper();

    AnonymousClass33p getWaSharedPreferences();

    AnonymousClass4FS getWaWorkers();

    AnonymousClass4FV getWamRuntime();

    Window getWindow();

    WindowManager getWindowManager();

    boolean hasWindowFocus();

    void invalidateOptionsMenu();

    boolean isFinishing();

    boolean isInMultiWindowMode();

    boolean isTaskRoot();

    void overridePendingTransition(int i, int i2);

    void setContentView(int i);

    void setSelectionActionMode(AnonymousClass0R2 r1);

    void setSupportActionBar(Toolbar toolbar);

    void startActivity(Intent intent);

    void startActivityForResult(Intent intent, int i);

    void unregisterReceiver(BroadcastReceiver broadcastReceiver);
}
