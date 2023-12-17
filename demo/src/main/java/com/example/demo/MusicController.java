package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MusicController implements Initializable{
    @FXML
    private Button buttonAlbumToQueue;

    @FXML
    private Button buttonChangePlaylistName;

    @FXML
    private Button buttonClearQueue;

    @FXML
    private Button buttonNextSong;

    @FXML
    private Button buttonPlayPause;

    @FXML
    private Button buttonPreviousSong;

    @FXML
    private Button buttonSongToPlaylist;

    @FXML
    private Button buttonSongToQueue;

    @FXML
    private Label labelMusicQueue;

    @FXML
    private Label labelPlaying;

    @FXML
    private Label labelPlaylists;

    @FXML
    private ListView<?> listMusicQueue;

    @FXML
    private ListView<?> listPlaylistSongs;

    @FXML
    private ListView<?> listPlaylists;

    @FXML
    private TableView<?> tableSongs;

    @FXML
    private TextField textCurrentSongName;

    @FXML
    private TextField textFunction;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {

    }

    @FXML
    public void OnRenamePlaylist()
    {
        textFunction.setText("Rename playlist");
    }
    @FXML
    public void OnNextSong()
    {
        textFunction.setText("Next song");
    }
    @FXML
    public void OnPreviousSong()
    {
        textFunction.setText("Previous song");
    }
    @FXML
    public void OnPlayPause()
    {
        textFunction.setText("Pause or resume song");
    }
    @FXML
    public void OnClearQueue()
    {
        textFunction.setText("Clear queue");
    }
    @FXML
    public void OnAddSongToQueue()
    {
        textFunction.setText("Add song to queue");
    }
    @FXML
    public void OnAddAlbumToQueue()
    {
        textFunction.setText("Add album to queue");
    }
    @FXML
    public void OnAddSongToPlaylist()
    {
        textFunction.setText("Add song to playlist");
    }



}