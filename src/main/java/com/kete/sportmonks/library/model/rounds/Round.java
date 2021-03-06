package com.kete.sportmonks.library.model.rounds;

import com.kete.sportmonks.library.model.league.LeagueData;
import com.kete.sportmonks.library.model.match.MatchDataList;
import com.kete.sportmonks.library.model.season.SeasonDataResponse;

public class Round {

    private Long id;
    private Long name;
    private Long league_id;
    private Long season_id;
    private Long stage_id;
    private String start;
    private String end;
    private MatchDataList fixtures;
    private SeasonDataResponse season;
    private LeagueData league;
    private MatchDataList results;

    public Round() {}

    public Long getId() {
        return id;
    }

    public Long getName() {
        return name;
    }

    public Long getLeague_id() {
        return league_id;
    }

    public Long getSeason_id() {
        return season_id;
    }

    public Long getStage_id() {
        return stage_id;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public MatchDataList getFixtures() {
        return fixtures;
    }

    public SeasonDataResponse getSeason() {
        return season;
    }

    public LeagueData getLeague() {
        return league;
    }

    public MatchDataList getResults() {
        return results;
    }
}
